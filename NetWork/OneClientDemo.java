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
//			����һ��socket����ָ�����ӵķ�����
			Socket socket = new Socket("localhost",6666);
//			��ȡsocket�����������
			PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			ps.println("hello,my name is jing");
			ps.flush();

//			��ȡ�������˷��ص�����
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
