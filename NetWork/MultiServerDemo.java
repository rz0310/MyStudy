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
//�������ͻ���
//���߳����ڼ����ͻ��˵����ӣ�ÿ�������ӳɹ�������һ���߳�������ͻ��˵���Ϣ
public class MultiServerDemo {
	public static void main(String[] args) {
//		�����̳߳�
		ExecutorService es = Executors.newFixedThreadPool(3);
		try {
//			�����󶨵�ָ�����ڵķ������׽���
			ServerSocket server = new ServerSocket(6666);
			System.out.println("�������Ѿ����������ڵȴ����ӡ�����");
			while(true) {
//				��ȡ������������
				Socket s = server.accept();
//				�����ַ
				System.out.println(s.getInetAddress().getHostAddress());
				es.execute(new UserThread(s));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//��������ͻ���������߳�����
class UserThread implements Runnable{
//	�����ӵ��������˵��û���������ͻ��˵��߳�ȥ����
	private Socket s;
	public UserThread(Socket s) {
		this.s = s;
	}
	@Override
	public void run() {
		try {
//			�����������������ȡ��Ϣ��д����Ϣ
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
