package Map����;
/*
 * Properties����Hashtable�����࣬�ö����ڴ��������ļ�ʱ�ر𷽱㣨Windows����ƽ̨�ϵ�ini�ļ�����һ�������ļ�����
 * Properties�ࣺ��1�����԰�Map����������ļ������������Ӷ���Map�����е�key-valueд�������ļ��С�
 *				��2��Ҳ���԰������ļ��е�"������=����ֵ"���ص�Map�����С�
 *
 *Properties�൱��һ��key��value����String���͵�Map��
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args)throws Exception {
		 Properties props = new  Properties();
//		 ��Properties���������
		 props.setProperty("username", "renjing");
		 props.setProperty("password", "123456");
//		 ��Properties��key-value�Ա��浽a.ini�ļ���###
		 props.store(new FileOutputStream("a.ini"), "comment line");
//		 �½�һ��Properties����
		 Properties props2 = new  Properties();
//		 ��Properties���������
		 props2.setProperty("gender", "male");
//		 ��a.ini�ļ��е�key-value��׷�ӵ�props2��###
		 props2.load(new FileInputStream("a.ini"));
		 System.out.println(props2);
	}
}
