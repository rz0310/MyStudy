package File_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo2 {
	public static void main(String[] args) {
		File file1 = new File("E:\\Demo\\renjing.txt");
		File file2 = new File("E:\\Demo\\zhangcong.txt");
		try {
			InputStream in = new FileInputStream(file1);
			OutputStream out = new FileOutputStream(file2);
			int b = 0;
			while((b = in.read()) != -1) {
				System.out.println(b);
				out.write(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
