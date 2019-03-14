package NetWork;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//处理多个客户端
//主线程用于监听客户端的连接，每次有连接成功，开启一个线程来处理客户端的消息
public class MultiServerDemo {
	public static void main(String[] args) {
//		创建线程池
		ExecutorService es = Executors.newFixedThreadPool(3);
		try {
//			创建绑定到指定窗口的服务器套接字
			ServerSocket server = new ServerSocket(6666);
			System.out.println("服务器已经启动，正在等待连接。。。");
			while(true) {
//				获取服务器的连接
				Socket s = server.accept();
//				输出地址
				System.out.println(s.getInetAddress().getHostAddress());
				es.execute(new UserThread(s));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//用来处理客户端请求的线程任务
class UserThread implements Runnable{
//	将连接到服务器端的用户交给处理客户端的线程去处理
	private Socket s;
	public UserThread(Socket s) {
		this.s = s;
	}
	@Override
	public void run() {
		try {
//			创建输入输出流来获取信息和写出信息
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintStream ps = new PrintStream(new BufferedOutputStream(s.getOutputStream()));
			String info = br.readLine();
			System.out.println(info);
			ps.println("echo:"+info);
			ps.flush();
			ps.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
