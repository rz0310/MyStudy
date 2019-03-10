package �ļ���IO;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
/*
 * ��ӡ����
 * �ֽڴ�ӡ������ǿ�������
 * �ַ���ӡ��
 */
public class PrintStreamDemo {
	
	public static void charPrint() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
		try {
			Writer write = new FileWriter(file);
//		�ӻ���
			BufferedWriter bw = new BufferedWriter(write);
//		��ǿ��ӡ����
			PrintWriter pw = new PrintWriter(bw);
			pw.println("������������������");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void bytePrint() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\test1.txt");
		try {
			OutputStream out = new FileOutputStream(file);
//			�ӻ���
			BufferedOutputStream bos = new BufferedOutputStream(out);
//			��ǿ��ӡ����
			PrintStream ps = new PrintStream(bos);
			ps.println("������");
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		bytePrint();
		charPrint();
	}
}
