package 文件与IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 * 文件的复制：
 * 从一个输入流中读取数据，然后通过输出流写到目标位置
 * 一边读一边写
 */
public class CopyFileDemo {
	
	public static void copy(String src,String target) {
//		创建源文件对象
		File srcFile = new File(src);
//		创建目标文件对象
		File targetFile = new File(target);
//		声明输入输出流
		InputStream in = null;
		OutputStream out = null;
		try {
//			获取源文件的输入流，即读取源文件
			in = new FileInputStream(srcFile);
//			获取目标文件的输出流，即写入到目标文件
			out = new FileOutputStream(targetFile);
			
//			bytes数组用来存储读取到的字节数据
			byte[] bytes = new byte[1024];
//			len表示读取到的长度
			int len = -1;
//			如果读取到的字节数组不为空，则将读到的字节数组写入到目标文件
			while((len = in.read(bytes)) != -1) {
				out.write(bytes, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			关闭输入输出流
			try {
				if(in != null) in.close();
				if(out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("srart copy.");
		copy("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\reba.jpg","E:\\reba.jpg");
		System.out.println("copy sucess.");
	}
}
