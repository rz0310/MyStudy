package Communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * ��������
 */
public class Server {
	public static void main(String[] args) {
//		���������������洦��ͻ��˵��߳�
		Vector<UserThread> vector = new Vector<>();
		ExecutorService es = Executors.newFixedThreadPool(5);
		try {
//			�����������˿�
			ServerSocket server = new ServerSocket(6666);
			System.out.println("�������Ѿ����������ڵȴ����ӡ�����");
			while(true) {
//				��ȡ����
				Socket socket = server.accept();
//				��������ͻ��˵��߳�,���������й���ͻ��˵������̵߳ļ��Ϻ�
//				�������Ķ˿ڴ�������߳�
				UserThread user = new UserThread(socket,vector);
//				ִ����Ӧ�Ĺ����߳�
				es.execute(user);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//�ͻ��˴�����߳�
class UserThread implements Runnable{
	private String name;//�ͻ����û����ƣ�Ψһ��
	private Socket socket;
	private Vector<UserThread> vector;//�ͻ��˴����̵߳ļ���
	private ObjectInputStream ois;//������
	private ObjectOutputStream oos;//�����
	private boolean flag = true;//��¼���ӵ�״̬
	
	public UserThread(Socket socket,Vector<UserThread> vector) {
		this.socket = socket;
		this.vector =  vector;
		vector.add(this);//����ǰ�Ĺ����̱߳��浽vector���ϵ��У����ڹ����߳�֮���ͨ��
	}
	@Override
	public void run() {
//		��ȡ���ӵ��������ϵ��û���ַ
		System.out.println("�ͻ���"+socket.getInetAddress().getHostAddress()+"������");
		try {
//			��ȡ������socket���������������
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			
			while(flag) {
//				��ȡ��Ϣ����
				Message msg = (Message)ois.readObject();
//				��ȡ��Ϣ����
				int type = msg.getType();
//				�ж���Ϣ����
				switch(type) {
//					���͵�������Ϣ
					case MessageType.TYPE_SEND:
						String to = msg.getTo();
						UserThread ut;
						int size = vector.size();
						for (int i = 0; i < size; i++) {
							ut = vector.get(i);
							if(to.equals(ut.name) && ut!=this) {
								ut.oos.writeObject(msg);
								break;
							}
						}
						break;
	//					��¼��Ϣ
					case MessageType.TYPE_LOGIN:
//						��ȡ������������Ϣ�Ŀͻ���
						name =  msg.getFrom();
						msg.setInfo("��ӭ����");
//						д��ȥ
						oos.writeObject(msg);
						break;
				}
			}
			ois.close();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}