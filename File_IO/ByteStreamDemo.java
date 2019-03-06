package �ļ���IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * �ֽ����������
 * 1.�����������OutPutStream�����ļ��������ʹ������FileOutPutStream
 * 2.������������InPutStream�����ļ���������ʹ��FileInputStream
 * 
 * ��������ֽ�������ԭ��ÿ��ֻ�����һ���ֽڣ����ļ��ж�ȡ��д�룩
 * 
 * �ֽڲ�������Ĭ��ÿ��ִ��д�������ֱ�Ӱ�����д���ļ���
 */
public class ByteStreamDemo {
	
	public static void in() {
//		0.ȷ��Ŀ���ļ�
		File f = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test2.txt");
		try {
//			1.�����ļ�������
			InputStream in = new FileInputStream(f);
//			��Ŷ�ȡ������
			byte[] bytes = new byte[10];
//			����ȡ�����ֽ�����ת��Ϊ�ַ������洢
			StringBuilder sb = new StringBuilder();
//			��ʾÿ�ζ�ȡ�ĳ���
			int len = -1;
//			2.�Ѷ�ȡ�����ݶ��뵽bytes�����У������ض�ȡ���ֽ�������������-1ʱ����ʾ��ȡ�����ݣ�������-1ʱ����ʾ�ļ��Ѿ���ȡ�ꡣ
			while((len = in.read(bytes)) != -1) {
//				3.���ݶ�ȡ�����ֽ����ݣ���ת��Ϊ�ַ������ݣ���ӵ�StringBuilder��
//				ע�⣺�˴�����ȡ����bytes����д�뵽�ַ����У�Ҫָ���ַ����������ʼλ�úͳ���
				sb.append(new String(bytes,0,len));
			}
//			4.��ӡ����
			System.out.println(sb);
//			5.�ر�������
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void out() {
//		0.ȷ��Ŀ���ļ�
		File f = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test2.txt");
//		1.����һ���ļ����������
		try {
			OutputStream out = new FileOutputStream(f,true);//appendΪtrue��ʾ��ԭ����������׷��
//			2.���������
			String str = "�ξ�����С��Ů\r\n";
//			String line = System.getProperty("line.separator");//��ȡ���з�
//			3.������д�뵽�ļ�
			out.write(str.getBytes());
//			4.�ر���
			out.close();
			System.out.println("write sucess.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		out();
		in();
	}
}
