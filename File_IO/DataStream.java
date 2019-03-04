package File_IO3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class DataStream {
	public static void main(String[] args) {
		try {
//			�����������������
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\FileTest\\a.txt"));
//			���������͵�����д��ȥ
			dos.writeInt(100);
			dos.writeDouble(10.88);
			dos.writeChar('D');
//			ˢ����
			dos.flush();
//			�ر���
			dos.close();
			
//			������������������
			DataInputStream dis = new DataInputStream(new FileInputStream("E:\\FileTest\\a.txt"));
//			��˳��д��ȥ���������ζ�ȡ����������ͻ�����
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			
//			����ʹ�ñ�׼�����
//			��׼�ַ������
			PrintWriter pw = new PrintWriter("E:\\FileTest\\a.txt");
//			��׼�ֽ������
			PrintStream ps = new PrintStream("E:\\FileTest\\a.txt");
//			pw.write("��ɵ��");
			ps.write(97);//д���ļ��������ASCII��
			pw.flush();
			pw.close();
			ps.flush();
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
