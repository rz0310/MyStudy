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
//		1.����
//		��������
		Properties p = new Properties();
//		��ȡproperties�ļ�
		File f = new File("E:\\FileTest\\a.properties");
		try {
//			�����ļ�������
			InputStream is = new FileInputStream(f);
//			���ڴ��м������ݵ�����
			p.load(is);
			p.setProperty("name", "renjing");
			p.setProperty("age", "20");
			String name = p.getProperty("name");
			String age = p.getProperty("age");
			System.out.println(p);
			System.out.println("name="+name+",age="+age);
			
//			�������е�ֵ���浽������
			Collection<Object> coll = p.values();
//			��������������
			Iterator<Object> it = coll.iterator();
//			�������
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
//		2.���
//		��������
		Properties p1 = new Properties();
//		��ȡproperties�ļ�
		File f1 = new File("E:\\FileTest\\a.properties");
		try {
//			�����ļ�������
			OutputStream os = new FileOutputStream(f1);
			p1.setProperty("name", "xiaohua");
			p1.store(os, "��ϲ��");
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
