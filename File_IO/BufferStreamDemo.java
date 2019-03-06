package �ļ���IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
/*
 * �����Ŀ�ģ�
 * �����д���ļ�����ʱ��Ƶ�������ļ�ʱ�����������ܽ��͵����⡣
 * 
 * BufferedOutputStream���ڲ�Ĭ�ϵĻ����СΪ8KB��ÿ��д��ʱ�洢�������е�byte�����У�
 * ���������ʱ���ٰ������е�����д�뵽�ļ������ѻ����±���㡣
 * 
 * �ַ���������
 * 1.�����ַ�����������ǿ��ȡ����(readLine)
 * 2.����Ч�Ķ�ȡ����
 * FileReader���ڲ�ʹ��InputStreamReader(sun.nio.cs.SreamDecoder),������̣�byte->char��Ĭ�ϻ����С��8K��
 * BufferedReader��Ĭ�ϻ����С��8K�����ǿ����ֶ�ָ�������С�������ݶ�ȡ�������У�����ÿ�ε�ת�����̣�Ч�ʸ��ߡ�
 * BufferedWriter:ͬ��
 */
public class BufferStreamDemo {
	
	public static void charWriter() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
		try {
			Writer write = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(write);
			bw.write("��Ů��Ů");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void charReader() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
		try{
			Reader reader = new FileReader(file);
//			Ϊ�ַ��������ṩ���壬�Դﵽ��Ч��ȡ��Ŀ��
			BufferedReader br = new BufferedReader(reader);
			char[] ch = new char[1024];
			int len = -1;
			while((len = br.read(ch)) != -1){
				System.out.println(new String(ch,0,len));
			}
			br.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void byteReader() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
		try {
//			����һ���ֽ�����������
			InputStream in = new FileInputStream(file);
//			����in�����һ���ֽ����뻺����
			BufferedInputStream bis = new BufferedInputStream(in);
			byte[] bytes = new byte[1024];
			int len = -1;
			while((len = bis.read(bytes)) != -1) {
				System.out.println(new String(bytes,0,len));
			}
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void byteReader2() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
//		��а�������Լ��رջ�������try���Զ������ǹر�
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
			
			byte[] bytes = new byte[1024];
			int len = -1;
			while((len = bis.read(bytes)) != -1) {
				System.out.println(new String(bytes,0,len));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void byteWriter() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
		try {
			OutputStream out = new FileOutputStream(file,true);
//			����һ���ֽ����������
			BufferedOutputStream bos = new BufferedOutputStream(out);
			String str = ",�濪��ѽ�濪��";
			bos.write(str.getBytes());
//			δ�ر�ǰд����������
			bos.close();
//			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
//		byteWriter();
		byteReader();
	}
}
