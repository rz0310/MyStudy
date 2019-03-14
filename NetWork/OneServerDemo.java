package NetWork;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class OneServerDemo {
	public static void main(String[] args) {
//		创建一个服务器端的Socket（1024-65535）
		try {
			ServerSocket server  = new ServerSocket(6666);
			System.out.println("服务器已经启动，正在等待客户端连接。。。");
//			等待客户端的连接，会造成阻塞（如果没有客户端连接），如果游客户端
//			连接成功，立即返回一个Socket对象
			Socket socket = server.accept();
			System.out.println("客户端连接成功:"+server.getInetAddress().getHostAddress());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			通过输入流读取网络数据，如果没有数据，也会造成阻塞
			String info = br.readLine();
			System.out.println(info);
			
//			获取输出流，向客户端返回消息
			PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
			ps.println("echo:"+info);
			ps.flush();
//			关闭流
			ps.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
