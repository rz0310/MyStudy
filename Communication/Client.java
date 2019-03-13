package Communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
 * �ͻ���
 */
public class Client {
	public static void main(String[] args) {
//		���ڱ���ͻ��˵�����
		Scanner input = new Scanner(System.in);
		ExecutorService es = Executors.newSingleThreadExecutor();
		try {
//			�����ͻ���socket
			Socket socket = new Socket("localhost",6666);
			System.out.println("���������ӳɹ�");
//			�����ͻ��˵����������
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
//			����������͵�¼��Ϣ
			System.out.println("���������ƣ�");
			String name = input.nextLine();
			Message msg = new Message(name,null,MessageType.TYPE_LOGIN,null);
			oos.writeObject(msg);
			msg = (Message)ois.readObject();
			System.out.println(msg.getInfo()+msg.getFrom());
//			������ȡ��Ϣ���߳�
			es.execute(new ReadInfoThread(ois));
			
//			ʹ�����߳�ʵ�ַ�����Ϣ
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
	//				��ȡ��Ϣ
					Message msg = (Message)in.readObject();
	//				�����Ϣ
					System.out.println("["+msg.getFrom()+"]����˵��"+msg.getInfo());
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
