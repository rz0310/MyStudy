package 文件与IO;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		以当前路径来创建一个File对象
		File file = new File(".");
//		直接输出文件名"."
		System.out.println(file.getName());
//		获取相对路径的父路径可能出错，下面代码输出null
		System.out.println(file.getParent());
//		获取绝对路径
		System.out.println(file.getAbsolutePath());
//		获取当前绝对路径的上一级路径
		System.out.println(file.getAbsoluteFile().getParent());
//		在当前路径下创建一个临时文件
		File tmpFile = file.createTempFile("aaa", ".txt",file);
//		指定当JVM退出时删除该文件
		tmpFile.deleteOnExit();
//		以系统当前时间作为新文件名来创建新文件
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		File newFile = new File(currentTimeMillis+"");
		System.out.println("newFile对象是否存在："+newFile.exists());
//		以指定NewFile对象来创建一个文件
		newFile.createNewFile();
		System.out.println(newFile.mkdir());
	}
}
