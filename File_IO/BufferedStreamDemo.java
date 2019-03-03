package File_IO2;

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

public class BufferedStreamDemo {
	public static void main(String[] args) {
//		bufferedIn();
//		bufferedOut();
//		bufferedreader();
	}
	public static void bufferedWriter() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("E:\\zhangcong.txt"),true));
			String str = "哈哈哈";
			bw.write(str);
			bw.newLine();
			bw.write(str);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void bufferedreader() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("E:\\zhangcong.txt")));
			String readLine = br.readLine();
			System.out.println(readLine);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void bufferedIn() {
//		1.有文件
		File f = new File("E:\\zhangcong.txt");
		try {
//			2.有字节输入流
			InputStream in = new FileInputStream(f);
//			3.有字节缓冲流
			BufferedInputStream bis = new BufferedInputStream(in);
			
//			设置缓冲区的大小
//			BufferedInputStream bis1 = new BufferedInputStream(in,100);
			
			byte[] b = new byte[bis.available()];
			bis.read(b);
			String str = new String(b,"utf-8");
			System.out.println(str);
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void bufferedOut() {
//		1.有文件
		File f = new File("E:\\zhangcong.txt");
		try {
//			2.有字节输出流
			OutputStream out = new FileOutputStream(f);
//			3.有字节缓冲流
			BufferedOutputStream bos = new BufferedOutputStream(out);
			
//			设置缓冲区的大小
//			BufferedInputStream bis1 = new BufferedInputStream(in,100);
			String str = "巴拉巴拉";
			bos.write(str.getBytes());
			bos.flush();
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
