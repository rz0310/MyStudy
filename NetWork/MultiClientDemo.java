package NetWork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class MultiClientDemo {
	public static void main(String[] args) {
//		创建键盘输入对象
		Scanner sc = new Scanner(System.in);
		try {
//			创建一个Socket对象，并指定要连接的服务器
			Socket socket = new Socket("localhost",6666);
//			获取socket的输入输出流
//			缓冲输入流（字节字符转换流（socket对象的输入流））
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			标准输出流（缓冲输出流（socket对象的输出流））
			PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
			System.out.println("请输入：");
			String info = sc.nextLine();
//			输出用户输入的数据
			ps.println(info);
//			刷新
			ps.flush();
//			读取服务器端返回的数据
			info = br.readLine();
			System.out.println(info);
			ps.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
