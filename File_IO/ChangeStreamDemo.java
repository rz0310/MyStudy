package �ļ���IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/*
 * �ֽ��ַ�ת������
 * OutputStreamWriter:��������ַ���ת��Ϊ�ֽ��������ʽ���ӳ���������ļ���
 * ����->OutputStreamWriter->OutputStream->���
 * 
 * InputStreamReader:��������ֽ���ת��Ϊ�ַ���������ʽ����ȡ���������棩
 * ����->InputStream->InputStreamReader->����
 */
public class ChangeStreamDemo {
//	д���ļ����ӳ���������ļ�
	private static void write(OutputStream out) {
//		�����ֽ��ַ�ת���������������,������ΪĬ�ϱ���
		Writer write = new OutputStreamWriter(out,Charset.defaultCharset());
		try {
//			д���ļ�
			write.write(",��������������");
//			�ر���
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	��ȡ�ļ������ļ���ȡ��������
	private static void reader(InputStream in) {
//		�����ֽ��ַ�ת����������������,������ΪĬ�ϱ���
		Reader reader = new InputStreamReader(in,Charset.defaultCharset());
//		����һ���ַ�����������Ŷ�ȡ������
		char[] ch = new char[1024];
//		����һ�������ַ�����
		StringBuilder sb = new StringBuilder();
		int len = -1;
		try {
			while((len = reader.read(ch)) != -1) {
//				�Ѷ�ȡ���ַ������е����ݶ�׷�ӵ��ַ�������
				sb.append(new String(ch,0,len));
			}
//			����õ����ַ�����
			System.out.println(sb);
//			�ر���
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
//		InputStream in = new FileInputStream("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
//		reader(in);
		
		OutputStream out = new FileOutputStream("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt",true);
		write(out);
	}
}
