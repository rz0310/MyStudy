package NetWork;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class OneClientDemo {
	public static void main(String[] args) {
		try {
//			创建一个socket对象，指定连接的服务器
			Socket socket = new Socket("localhost",6666);
//			获取socket的输入输出流
			PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			ps.println("hello,my name is jing");
			ps.flush();

//			读取服务器端返回的数据
			String info = br.readLine();
			System.out.println(info);
			ps.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
