package 文件与IO;

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
 * 打印流：
 * 字节打印流：增强输出功能
 * 字符打印流
 */
public class PrintStreamDemo {
	
	public static void charPrint() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
		try {
			Writer write = new FileWriter(file);
//		加缓存
			BufferedWriter bw = new BufferedWriter(write);
//		增强打印功能
			PrintWriter pw = new PrintWriter(bw);
			pw.println("哈哈哈哈哈哈哈哈哈");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void bytePrint() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
		try {
			OutputStream out = new FileOutputStream(file);
//			加缓存
			BufferedOutputStream bos = new BufferedOutputStream(out);
//			增强打印功能
			PrintStream ps = new PrintStream(bos);
			ps.println("哈哈哈");
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
