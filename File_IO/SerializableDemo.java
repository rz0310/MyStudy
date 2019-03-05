package File_IO3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo{
	public static void main(String[] args) {
		try {
//			序列化
//			创建对象输出流
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("E:\\FileTest\\aa.txt")));
//			创建Dog对象
			Dog d = new Dog();
			d.setName("旺财");
			d.setAge(20);
//			将Dog对象d写出去
			out.writeObject(d);
			out.flush();
			out.close();
			System.out.println(d);
			
//			反序列化
//			创建对象输入流
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\FileTest\\aa.txt")));
//			读取对象存入Dog对象d2中
			Dog d2 = (Dog) ois.readObject();
//			获取属性
			System.out.println(d2.getName());
			System.out.println(d2.getAge());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
