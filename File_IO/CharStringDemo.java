package �ļ���IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * �ַ�����
 * �ַ��������Writer�����ļ��Ĳ���ʹ�����ࣺFileWriter
 * �ַ���������Reader�����ļ��Ĳ���ʹ�����ࣺFileReader
 * ÿ�β����ĵ�λ��һ���ַ���
 * 
 * �ļ��ַ����������Դ����棬Ĭ�ϴ�СΪ1024�ֽ�(1KB)���ڻ������󣬻��ֶ�ˢ�»��棬
 * ��ر���ʱ���Ż������д���ļ���
 * 
 * ���ѡ��ʹ���ֽ��������ַ�����
 * һ��������ı��ļ���ͼƬ����Ƶ�ȣ�ʱ��ʹ���ֽ����������ı��ļ�ʱ��ʹ���ַ�����
 * 
 * �ַ������ڲ�ʵ�ֻ����ֽ�����
 */
public class CharStringDemo {
	
	public static void in() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
		try {
			Reader in = new FileReader(file);
			char[] ch = new char[1];
			StringBuilder sb = new StringBuilder();
			int len = -1;
			while((len = in.read(ch)) != -1) {
				sb.append(new String(ch,0,len));
			}
			in.close();
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void out() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
		try {
			Writer out = new FileWriter(file,true);
			out.write(",�Ŵϴ��Ǵ󱿵�");
			System.out.println("д��ɹ�");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		out();	
		in();
	}
}
