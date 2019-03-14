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
//		����һ���������˵�Socket��1024-65535��
		try {
			ServerSocket server  = new ServerSocket(6666);
			System.out.println("�������Ѿ����������ڵȴ��ͻ������ӡ�����");
//			�ȴ��ͻ��˵����ӣ���������������û�пͻ������ӣ�������οͻ���
//			���ӳɹ�����������һ��Socket����
			Socket socket = server.accept();
			System.out.println("�ͻ������ӳɹ�:"+server.getInetAddress().getHostAddress());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			ͨ����������ȡ�������ݣ����û�����ݣ�Ҳ���������
			String info = br.readLine();
			System.out.println(info);
			
//			��ȡ���������ͻ��˷�����Ϣ
			PrintStream ps = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
			ps.println("echo:"+info);
			ps.flush();
//			�ر���
			ps.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
