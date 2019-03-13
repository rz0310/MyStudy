package Communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 服务器端
 */
public class Server {
	public static void main(String[] args) {
//		创建集合用来保存处理客户端的线程
		Vector<UserThread> vector = new Vector<>();
		ExecutorService es = Executors.newFixedThreadPool(5);
		try {
//			创建服务器端口
			ServerSocket server = new ServerSocket(6666);
			System.out.println("服务器已经启动，正在等待连接。。。");
			while(true) {
//				获取连接
				Socket socket = server.accept();
//				创建管理客户端的线程,并将保存有管理客户端的所有线程的集合和
//				服务器的端口传入管理线程
				UserThread user = new UserThread(socket,vector);
//				执行相应的管理线程
				es.execute(user);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//客户端处理的线程
class UserThread implements Runnable{
	private String name;//客户端用户名称（唯一）
	private Socket socket;
	private Vector<UserThread> vector;//客户端处理线程的集合
	private ObjectInputStream ois;//输入流
	private ObjectOutputStream oos;//输出流
	private boolean flag = true;//记录连接的状态
	
	public UserThread(Socket socket,Vector<UserThread> vector) {
		this.socket = socket;
		this.vector =  vector;
		vector.add(this);//将当前的管理线程保存到vector集合当中，便于管理线程之间的通信
	}
	@Override
	public void run() {
//		获取连接到服务器上的用户地址
		System.out.println("客户端"+socket.getInetAddress().getHostAddress()+"已连接");
		try {
//			获取服务器socket的输入流和输出流
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			while(flag) {
//				读取消息对象
				Message msg = (Message)ois.readObject();
//				获取消息类型
				int type = msg.getType();
//				判断消息类型
				switch(type) {
//					发送的其他消息
					case MessageType.TYPE_SEND:
						String to = msg.getTo();
						UserThread ut;
						int size = vector.size();
						for (int i = 0; i < size; i++) {
							ut = vector.get(i);
							if(to.equals(ut.name) && ut!=this) {
								ut.oos.writeObject(msg);
								break;
							}
						}
						break;
	//					登录消息
					case MessageType.TYPE_LOGIN:
//						获取给服务器发消息的客户名
						name =  msg.getFrom();
						msg.setInfo("欢迎您：");
//						写出去
						oos.writeObject(msg);
						break;
				}
			}
			ois.close();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}