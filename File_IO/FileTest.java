package �ļ���IO;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
//		�Ե�ǰ·��������һ��File����
		File file = new File(".");
//		ֱ������ļ���"."
		System.out.println(file.getName());
//		��ȡ���·���ĸ�·�����ܳ�������������null
		System.out.println(file.getParent());
//		��ȡ����·��
		System.out.println(file.getAbsolutePath());
//		��ȡ��ǰ����·������һ��·��
		System.out.println(file.getAbsoluteFile().getParent());
//		�ڵ�ǰ·���´���һ����ʱ�ļ�
		File tmpFile = file.createTempFile("aaa", ".txt",file);
//		ָ����JVM�˳�ʱɾ�����ļ�
		tmpFile.deleteOnExit();
//		��ϵͳ��ǰʱ����Ϊ���ļ������������ļ�
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		File newFile = new File(currentTimeMillis+"");
		System.out.println("newFile�����Ƿ���ڣ�"+newFile.exists());
//		��ָ��NewFile����������һ���ļ�
		newFile.createNewFile();
		System.out.println(newFile.mkdir());
	}
}
