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
//		���������������
		Scanner sc = new Scanner(System.in);
		try {
//			����һ��Socket���󣬲�ָ��Ҫ���ӵķ�����
			Socket socket = new Socket("localhost",6666);
//			��ȡsocket�����������
//			�������������ֽ��ַ�ת������socket���������������
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			��׼������������������socket��������������
			PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
			System.out.println("�����룺");
			String info = sc.nextLine();
//			����û����������
			ps.println(info);
//			ˢ��
			ps.flush();
//			��ȡ�������˷��ص�����
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
