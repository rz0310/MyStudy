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
//			���л�
//			�������������
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("E:\\FileTest\\aa.txt")));
//			����Dog����
			Dog d = new Dog();
			d.setName("����");
			d.setAge(20);
//			��Dog����dд��ȥ
			out.writeObject(d);
			out.flush();
			out.close();
			System.out.println(d);
			
//			�����л�
//			��������������
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:\\FileTest\\aa.txt")));
//			��ȡ�������Dog����d2��
			Dog d2 = (Dog) ois.readObject();
//			��ȡ����
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
