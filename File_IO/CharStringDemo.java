package 文件与IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 字符流：
 * 字符输出流：Writer，对文件的操作使用子类：FileWriter
 * 字符输入流：Reader，对文件的操作使用子类：FileReader
 * 每次操作的单位是一个字符。
 * 
 * 文件字符操作流会自带缓存，默认大小为1024字节(1KB)，在缓存满后，或手动刷新缓存，
 * 或关闭流时，才会把数据写入文件。
 * 
 * 如何选择使用字节流还是字符流：
 * 一般操作非文本文件（图片，视频等）时，使用字节流，操作文本文件时，使用字符流。
 * 
 * 字符流的内部实现还是字节流。
 */
public class CharStringDemo {
	
	public static void in() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
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
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
		try {
			Writer out = new FileWriter(file,true);
			out.write(",张聪聪是大笨蛋");
			System.out.println("写入成功");
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
