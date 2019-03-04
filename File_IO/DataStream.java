package File_IO3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class DataStream {
	public static void main(String[] args) {
		try {
//			创建数据输出流对象
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\FileTest\\a.txt"));
//			将各种类型的数据写出去
			dos.writeInt(100);
			dos.writeDouble(10.88);
			dos.writeChar('D');
//			刷新流
			dos.flush();
//			关闭流
			dos.close();
			
//			创建数据输入流对象
			DataInputStream dis = new DataInputStream(new FileInputStream("E:\\FileTest\\a.txt"));
//			按顺序将写出去的数据依次读取进来，否则就会乱码
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			
//			或者使用标准输出流
//			标准字符输出流
			PrintWriter pw = new PrintWriter("E:\\FileTest\\a.txt");
//			标准字节输出流
			PrintStream ps = new PrintStream("E:\\FileTest\\a.txt");
//			pw.write("大傻子");
			ps.write(97);//写入文件里面的是ASCII码
			pw.flush();
			pw.close();
			ps.flush();
			ps.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
