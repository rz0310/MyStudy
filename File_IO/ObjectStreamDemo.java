package �ļ���IO;

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
	 * �������л����Ѷ���д���ļ���ʵ��д��������������������������͡����Ե�ֵ
	 */
	public static void readObject() {
		Dog d = new Dog("wangwang",2,"girl");
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\dog.obj");
		try {
			InputStream os = new FileInputStream(file);
//			��������������
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
	 * �����л������ļ��аѶ�������ݶ�ȡ��������ԭ�ɶ���
	 */
	private static void writerObjects() {
		Dog d = new Dog("wangwang",2,"girl");
		Dog d2 = new Dog("erha",3,"boy");
		Dog[] dogs = {d,d2};
		File file = new File("E:\\Workspace\\MyStudy_day21_IO��\\createNewFileTest\\dog.obj");
		try {
//			java.io.NotSerializableException:û�����л� �쳣
			OutputStream os = new FileOutputStream(file);
//			�������������
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
