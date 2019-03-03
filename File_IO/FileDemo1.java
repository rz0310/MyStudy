package File_IO2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo1 {
	public static void main(String[] args) {
		File f = new File("E:\\zhangcong.txt");
		in(f);
	}
	public static void in(File f) {
		try {
//			使用多态创建文件输入流
			InputStream  in = new FileInputStream(f);
			byte[] bytes = new byte[in.available()];
//			将bytes数组的编码改为utf-8
			in.read(bytes);
			String str = new String(bytes,"utf-8");
			System.out.println(str);
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void out(File f) {
		try {
			OutputStream out = new FileOutputStream(f);
			String str = "你好呀";
			byte[] bytes = str.getBytes();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
