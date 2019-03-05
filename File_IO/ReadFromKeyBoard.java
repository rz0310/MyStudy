package File_IO3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
//从键盘读取数据
public class ReadFromKeyBoard {
	public static void main(String[] args) {
		try {
//			创建字符输入缓冲流，从键盘输入的要用InputStreamReader来接收
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			读取一行
			String readLine = br.readLine();
			System.out.println(readLine);
			
//			创建标准输出流
			PrintWriter pw = new PrintWriter("E:\\FileTest\\a.txt");
//			将输入的内容写到文件中
			pw.write(readLine);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
