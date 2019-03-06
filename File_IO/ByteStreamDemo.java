package 文件与IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 字节输入输出流
 * 1.输出流：超类OutPutStream，对文件的输出流使用子类FileOutPutStream
 * 2.输入流：超类InPutStream，对文件的输入流使用FileInputStream
 * 
 * 输入输出字节流操作原理，每次只会操作一个字节（从文件中读取或写入）
 * 
 * 字节操作流，默认每次执行写入操作会直接把数据写入文件。
 */
public class ByteStreamDemo {
	
	public static void in() {
//		0.确定目标文件
		File f = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test2.txt");
		try {
//			1.创建文件输入流
			InputStream in = new FileInputStream(f);
//			存放读取的数据
			byte[] bytes = new byte[10];
//			将读取到的字节数据转换为字符串并存储
			StringBuilder sb = new StringBuilder();
//			表示每次读取的长度
			int len = -1;
//			2.把读取的数据读入到bytes数组中，并返回读取的字节数，当不等于-1时，表示读取到数据，当等于-1时，表示文件已经读取完。
			while((len = in.read(bytes)) != -1) {
//				3.根据读取到的字节数据，在转换为字符串内容，添加到StringBuilder中
//				注意：此处将读取到的bytes数组写入到字符串中，要指明字符串数组的起始位置和长度
				sb.append(new String(bytes,0,len));
			}
//			4.打印内容
			System.out.println(sb);
//			5.关闭输入流
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void out() {
//		0.确定目标文件
		File f = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\test2.txt");
//		1.构建一个文件输出流对象
		try {
			OutputStream out = new FileOutputStream(f,true);//append为true表示在原来的内容上追加
//			2.输出的内容
			String str = "任静静是小仙女\r\n";
//			String line = System.getProperty("line.separator");//获取换行符
//			3.把内容写入到文件
			out.write(str.getBytes());
//			4.关闭流
			out.close();
			System.out.println("write sucess.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		out();
		in();
	}
}
