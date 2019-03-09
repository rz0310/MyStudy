package 文件与IO;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileDemo1 {
	public static void main(String[] args) {
//		创建文件时路径的写法：
//		1.C:\\test\\test.txt
//		2.C:/test/test.txt
//		创建文件的写法
//		文件路径的分隔符:File.separator
//		File f1 = new File("E:\\FileTest\\a.txt");
		File f1 = new File("E:\\FileTest\\a.txt");
		if(!f1.exists()) {
			try {
				f1.createNewFile();
				System.out.println(f1.isDirectory());
				System.out.println("创建文件成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("是否为文件夹："+f1.isDirectory());
		System.out.println("是否为文件："+f1.isFile());
//		获取文件或者文件夹对象
		File f2 = new File("E:\\FileTest");
//		删除文件夹f2：删除的文件夹为空时才可以删除，否则无法删除
		boolean b = f2.delete();
		System.out.println("文件夹是否可以删除："+b);
//		列出当前目录下的所有文件名
		String[] name = f2.list();
		System.out.println("文件夹下的文件有：");
		System.out.println(Arrays.toString(name));
		System.out.println("-----------------------------");
//		列出当前目录下的所有文件，以File对象返回
		File[] files = f2.listFiles();
		if(files != null) {
			for(File f: files) {
				System.out.println("文件名："+f.getName());
				System.out.println("文件长度："+f.length());
				System.out.println("相对路径："+f.getPath());
				System.out.println("绝对路径："+f.getAbsolutePath());
				System.out.println("是否为隐藏文件："+f.isHidden());
				System.out.println("是否为可读文件："+f.canRead());
				System.out.println("是否为可写文件："+f.canWrite());
				Date date = new Date(f.lastModified());
				DateFormat df = new SimpleDateFormat("HH:mm:ss");
				System.out.println("文件最后的修改时间："+df.format(date));
				System.out.println("----------------------------------");
			}
		}
		
		File f3 = new File("temp.txt");
//		相对路径
		System.out.println(f3.getPath());
//		绝对路径
		System.out.println(f3.getAbsolutePath());
		
		File f4 = new File("E:\\FileTest\\a.txt");
//		mkdir():创建由此抽象路径名命名的目录。
//		创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。 请注意，如果此操作失败，它可能已成功创建一些必需的父目录。 
		f4.mkdirs();
//		重命名与移动文件夹（因为参数传的是文件而不是字符串）
		f4.renameTo(new File("E:\\FileTest\\aa.txt"));
		
		System.out.println("------------------------------------");
		File f5 = new File("E:\\FileTest");

		File[] files2 = f5.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".txt");
			}
		});
//		函数式编程
		File[] files3 = f5.listFiles((pathname)->pathname.getName().endsWith(".txt"));
		System.out.println("文件夹下的所有txt文件：");
		if(files3 != null) {
			for (File f : files3) {
				System.out.println(f.getName());
			}
		}
	}
	
}
