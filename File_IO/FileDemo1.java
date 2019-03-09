package �ļ���IO;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileDemo1 {
	public static void main(String[] args) {
//		�����ļ�ʱ·����д����
//		1.C:\\test\\test.txt
//		2.C:/test/test.txt
//		�����ļ���д��
//		�ļ�·���ķָ���:File.separator
//		File f1 = new File("E:\\FileTest\\a.txt");
		File f1 = new File("E:\\FileTest\\a.txt");
		if(!f1.exists()) {
			try {
				f1.createNewFile();
				System.out.println(f1.isDirectory());
				System.out.println("�����ļ��ɹ�");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�Ƿ�Ϊ�ļ��У�"+f1.isDirectory());
		System.out.println("�Ƿ�Ϊ�ļ���"+f1.isFile());
//		��ȡ�ļ������ļ��ж���
		File f2 = new File("E:\\FileTest");
//		ɾ���ļ���f2��ɾ�����ļ���Ϊ��ʱ�ſ���ɾ���������޷�ɾ��
		boolean b = f2.delete();
		System.out.println("�ļ����Ƿ����ɾ����"+b);
//		�г���ǰĿ¼�µ������ļ���
		String[] name = f2.list();
		System.out.println("�ļ����µ��ļ��У�");
		System.out.println(Arrays.toString(name));
		System.out.println("-----------------------------");
//		�г���ǰĿ¼�µ������ļ�����File���󷵻�
		File[] files = f2.listFiles();
		if(files != null) {
			for(File f: files) {
				System.out.println("�ļ�����"+f.getName());
				System.out.println("�ļ����ȣ�"+f.length());
				System.out.println("���·����"+f.getPath());
				System.out.println("����·����"+f.getAbsolutePath());
				System.out.println("�Ƿ�Ϊ�����ļ���"+f.isHidden());
				System.out.println("�Ƿ�Ϊ�ɶ��ļ���"+f.canRead());
				System.out.println("�Ƿ�Ϊ��д�ļ���"+f.canWrite());
				Date date = new Date(f.lastModified());
				DateFormat df = new SimpleDateFormat("HH:mm:ss");
				System.out.println("�ļ������޸�ʱ�䣺"+df.format(date));
				System.out.println("----------------------------------");
			}
		}
		
		File f3 = new File("temp.txt");
//		���·��
		System.out.println(f3.getPath());
//		����·��
		System.out.println(f3.getAbsolutePath());
		
		File f4 = new File("E:\\FileTest\\a.txt");
//		mkdir():�����ɴ˳���·����������Ŀ¼��
//		�����ɴ˳���·����������Ŀ¼�������κα��赫�����ڵĸ�Ŀ¼�� ��ע�⣬����˲���ʧ�ܣ��������ѳɹ�����һЩ����ĸ�Ŀ¼�� 
		f4.mkdirs();
//		���������ƶ��ļ��У���Ϊ�����������ļ��������ַ�����
		f4.renameTo(new File("E:\\FileTest\\aa.txt"));
		
		System.out.println("------------------------------------");
		File f5 = new File("E:\\FileTest");

		File[] files2 = f5.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".txt");
			}
		});
//		����ʽ���
		File[] files3 = f5.listFiles((pathname)->pathname.getName().endsWith(".txt"));
		System.out.println("�ļ����µ�����txt�ļ���");
		if(files3 != null) {
			for (File f : files3) {
				System.out.println(f.getName());
			}
		}
	}
	
}
