package File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

public class FileDemo {
	public File createFile(String src) {
		File file = new File(src);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return file;
	}
	public void in(File file) {
		try {
//			读取到程序中
			InputStream in = new FileInputStream(file);
			byte[] bytes = new byte[in.available()];
			in.read(bytes, 0, bytes.length);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void out(File file) {
//		输出到文件
		try {
			OutputStream out = new FileOutputStream(file);
			String str = "小仙女";
			byte[] bytes = str.getBytes();
			out.write(bytes, 0, bytes.length);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test() {
		File file1 = createFile("E:\\Demo\\renjing.txt");
		File file2 = new File("E:\\Demo\\zhangcong.txt");
		in(file1);
		out(file1);
		out(file2);
	}
}
