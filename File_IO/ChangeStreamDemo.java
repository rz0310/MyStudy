package 文件与IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/*
 * 字节字符转换流：
 * OutputStreamWriter:将输出的字符流转换为字节流输出形式（从程序输出到文件）
 * 程序->OutputStreamWriter->OutputStream->输出
 * 
 * InputStreamReader:将输入的字节流转换为字符流输入形式（读取到程序里面）
 * 输入->InputStream->InputStreamReader->程序
 */
public class ChangeStreamDemo {
//	写入文件即从程序输出到文件
	private static void write(OutputStream out) {
//		创建字节字符转换流的输出流对象,并设置为默认编码
		Writer write = new OutputStreamWriter(out,Charset.defaultCharset());
		try {
//			写入文件
			write.write(",巴拉巴拉巴拉拉");
//			关闭流
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	读取文件即从文件读取到程序中
	private static void reader(InputStream in) {
//		创建字节字符转换流的输入流对象,并设置为默认编码
		Reader reader = new InputStreamReader(in,Charset.defaultCharset());
//		创建一个字符数组用来存放读取的数据
		char[] ch = new char[1024];
//		创建一个缓冲字符对象
		StringBuilder sb = new StringBuilder();
		int len = -1;
		try {
			while((len = reader.read(ch)) != -1) {
//				把读取到字符数组中的数据都追加到字符对象中
				sb.append(new String(ch,0,len));
			}
//			输出得到的字符对象
			System.out.println(sb);
//			关闭流
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
//		InputStream in = new FileInputStream("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt");
//		reader(in);
		
		OutputStream out = new FileOutputStream("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test1.txt",true);
		write(out);
	}
}
