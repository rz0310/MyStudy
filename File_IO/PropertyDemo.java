package File_IO3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

public class PropertyDemo {
	public static void propertyIn() {
//		1.输入
//		创建容器
		Properties p = new Properties();
//		获取properties文件
		File f = new File("E:\\FileTest\\a.properties");
		try {
//			创建文件输入流
			InputStream is = new FileInputStream(f);
//			从内存中加载内容到容器
			p.load(is);
			p.setProperty("name", "renjing");
			p.setProperty("age", "20");
			String name = p.getProperty("name");
			String age = p.getProperty("age");
			System.out.println(p);
			System.out.println("name="+name+",age="+age);
			
//			将容器中的值保存到集合中
			Collection<Object> coll = p.values();
//			创建迭代器对象
			Iterator<Object> it = coll.iterator();
//			遍历输出
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void propertyOut() {
//		2.输出
//		创建容器
		Properties p1 = new Properties();
//		获取properties文件
		File f1 = new File("E:\\FileTest\\a.properties");
		try {
//			创建文件输入流
			OutputStream os = new FileOutputStream(f1);
			p1.setProperty("name", "xiaohua");
			p1.store(os, "不喜欢");
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		propertyIn();
	}
	
}
