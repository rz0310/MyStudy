package �ļ���IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/*
 * �ļ��ĸ��ƣ�
 * ��һ���������ж�ȡ���ݣ�Ȼ��ͨ�������д��Ŀ��λ��
 * һ�߶�һ��д
 */
public class CopyFileDemo {
	
	public static void copy(String src,String target) {
//		����Դ�ļ�����
		File srcFile = new File(src);
//		����Ŀ���ļ�����
		File targetFile = new File(target);
//		�������������
		InputStream in = null;
		OutputStream out = null;
		try {
//			��ȡԴ�ļ���������������ȡԴ�ļ�
			in = new FileInputStream(srcFile);
//			��ȡĿ���ļ������������д�뵽Ŀ���ļ�
			out = new FileOutputStream(targetFile);
			
//			bytes���������洢��ȡ�����ֽ�����
			byte[] bytes = new byte[1024];
//			len��ʾ��ȡ���ĳ���
			int len = -1;
//			�����ȡ�����ֽ����鲻Ϊ�գ��򽫶������ֽ�����д�뵽Ŀ���ļ�
			while((len = in.read(bytes)) != -1) {
				out.write(bytes, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			�ر����������
			try {
				if(in != null) in.close();
				if(out != null) out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("srart copy.");
		copy("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\reba.jpg","E:\\reba.jpg");
		System.out.println("copy sucess.");
	}
}
