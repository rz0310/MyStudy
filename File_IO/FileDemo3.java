package File_IO;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo3 {
//	从父抽象路径名和子路径名字符串创建新的 File实例。
	public String getFile(File f,String child) {
		File file = null;
//		如果文件夹存在就创建文件
		if(f.exists()) {
			file = new File(f,child);
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
//			否则创建文件夹，然后再调用方法创建文件
			f.mkdir();
			getFile(f,child);
		}
		return file.getAbsolutePath();
	}
//	将内容输出到文件中
	public void out(File f) {
//		如果该文件不存在
		if(!f.exists()) {
			try {
//				创建该文件
				f.createNewFile();
//				并将字符串中的内容写入文件
				String str = "哈哈哈哈哈哈哈哈哈哈";
				OutputStream out = new FileOutputStream(f);//创建文件输出流
				byte[] bytes = str.getBytes();//将字符串转为byte类型的数组
				out.write(bytes);//将流中的数据写入数组
				out.flush();//刷新流
				out.close();//关闭流
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
//			文件存在则删除
			f.delete();
		}
		
	}
//	查找文件是否存在
	public void search(File f) {
//		如果存在，则遍历
		if(f.exists()) {
			File[] listFiles = f.listFiles();
			for (File file : listFiles) {
//				是文件夹，继续遍历
				if(file.isDirectory()) {
					search(f);
				}else {
//					否则判断该文件是否为目标文件，并输出其全路径
					if(f.getAbsolutePath().endsWith("hello.java")) {
						System.out.println("找到文件");
						System.out.println(f.getAbsolutePath());
					}
				}
			}
		}else {
			System.out.println("文件不存在");
		}
	}
//	读取到程序中，在写入另一个文件
	public static void in(File f) {
//		如果文件
		if(f.getName().endsWith("a.java")) {
			System.out.println(f.getAbsolutePath());
			InputStream in;
			try {
//				创建文件输入流
				in = new FileInputStream(f);
//				根据f文件的父路径创建新文件
				File f3 = new File(f.getParent()+"\\success.txt");
//				创建文件输出流
				OutputStream out = new FileOutputStream(f3);
//				创建byte数组，用来写入success文件
				byte[] bytes = new byte[(int) f3.length()];
				
				int len = -1;
//				一边读取一边写入
				while((len = in.read()) != -1) {
					System.out.print(len);
					System.out.println();
					out.write(bytes);
				}
				in.close();
				out.flush();
				out.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void filterTest(File f) {
//		过滤器
//		此数组中保存所有符合过滤器条件的文件
		File[] listFiles = f.listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
//				返回文件名后缀为.txt的所有文件
				return f.getName().endsWith(".txt");
			}
			
		});
	}
	public static void main(String[] args) {
		FileDemo3 fd = new FileDemo3();
		File f = new File("E:\\Hello\\a.txt");
		String child1 = "\\a.txt";
		String child2 = "\\b.txt";
		String file = fd.getFile(f,child1);
		fd.in(f);
	}
}
