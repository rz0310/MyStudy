package Communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * 客户端
 */
public class Client {
	public static void main(String[] args) {
//		用于保存客户端的输入
		Scanner input = new Scanner(System.in);
		ExecutorService es = Executors.newSingleThreadExecutor();
		try {
//			创建客户端socket
			Socket socket = new Socket("localhost",6666);
			System.out.println("服务器连接成功");
//			创建客户端的输入输出流
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//			向服务器发送登录消息
			System.out.println("请输入名称：");
			String name = input.nextLine();
			Message msg = new Message(name,null,MessageType.TYPE_LOGIN,null);
			oos.writeObject(msg);
			msg = (Message)ois.readObject();
			System.out.println(msg.getInfo()+msg.getFrom());
//			启动读取消息的线程
			es.execute(new ReadInfoThread(ois));
			
//			使用主线程实现发送消息
			boolean flag = true;
			while(flag) {
				msg = new Message();
				System.out.println("To:");
				msg.setTo(input.nextLine());
				msg.setFrom(name);
				msg.setType(MessageType.TYPE_SEND);
				System.out.println("info:");
				msg.setInfo(input.nextLine());
				oos.writeObject(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class ReadInfoThread implements Runnable {
	private ObjectInputStream in;
	private boolean flag = true;
	
	public ReadInfoThread(ObjectInputStream in) {
		this.in = in;
	}
	
	@Override
	public void run() {
			try {
				while(flag) {
	//				读取消息
					Message msg = (Message)in.readObject();
	//				输出消息
					System.out.println("["+msg.getFrom()+"]对你说："+msg.getInfo());
				}
				if(in != null) {
					in.close();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
}
