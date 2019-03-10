package 文件与IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectStreamDemo {
	/*
	 * 对象序列化：把对象写入文件，实际写入的是类名、属性名、属性类型、属性的值
	 */
	public static void readObject() {
		Dog d = new Dog("wangwang",2,"girl");
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\dog.obj");
		try {
			InputStream os = new FileInputStream(file);
//			创建对象输入流
			ObjectInputStream ois = new ObjectInputStream(os);
			Dog[] dog = (Dog[])ois.readObject();
			ois.close();
			for (Dog dog2 : dog) {
				System.out.println(dog2.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 反序列化：从文件中把对象的内容读取出来，还原成对象
	 */
	private static void writerObjects() {
		Dog d = new Dog("wangwang",2,"girl");
		Dog d2 = new Dog("erha",3,"boy");
		Dog[] dogs = {d,d2};
		File file = new File("E:\\Workspace\\MyStudy_day21_IO流\\createNewFileTest\\dog.obj");
		try {
//			java.io.NotSerializableException:没有序列化 异常
			OutputStream os = new FileOutputStream(file);
//			创建对象输出流
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(dogs);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		writerObjects();
		readObject();
	}
}
