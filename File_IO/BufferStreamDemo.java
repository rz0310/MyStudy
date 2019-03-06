package 文件与IO;

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
 * 缓存的目的：
 * 解决在写入文件操作时，频繁操作文件时所带来的性能降低的问题。
 * 
 * BufferedOutputStream，内部默认的缓存大小为8KB，每次写入时存储到缓存中的byte数组中，
 * 当数组存满时，再把数组中的数据写入到文件，并把缓存下标归零。
 * 
 * 字符缓存流：
 * 1.加入字符缓冲流，增强读取功能(readLine)
 * 2.更高效的读取数据
 * FileReader：内部使用InputStreamReader(sun.nio.cs.SreamDecoder),解码过程，byte->char，默认缓存大小是8K。
 * BufferedReader：默认缓存大小是8K，但是可以手动指定缓存大小，把数据读取到缓存中，减少每次的转换过程，效率更高。
 * BufferedWriter:同上
 */
public class BufferStreamDemo {
	
	public static void charWriter() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
		try {
			Writer write = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(write);
			bw.write("仙女仙女");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void charReader() {
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
		try{
			Reader reader = new FileReader(file);
//			为字符输入流提供缓冲，以达到高效存取的目的
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
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
		try {
//			创建一个字节输入流对象
			InputStream in = new FileInputStream(file);
//			创建in对象的一个字节输入缓冲流
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
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
//		此邪法不用自己关闭缓冲流，try会自动帮我们关闭
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
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
		try {
			OutputStream out = new FileOutputStream(file,true);
//			构造一个字节输出缓冲流
			BufferedOutputStream bos = new BufferedOutputStream(out);
			String str = ",真开心呀真开心";
			bos.write(str.getBytes());
//			未关闭前写到缓存里面
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
