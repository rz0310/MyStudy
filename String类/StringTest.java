package String��;

import org.junit.Test;

public class StringTest {
	public void stringTest() {
		String s1 = "Beijing";
		String s2 = "beijing";
		String s3 = "beijin";
//		�ַ������Ȳ���ȣ�ֱ�ӷ���
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));
		System.out.println(s1.toLowerCase().compareTo(s2.toLowerCase()));
		String s8 = "";
//		���Դ�Сд�ж������ַ����Ƿ����
//		System.out.println(s1.equalsIgnoreCase(s2));
//		�ж�ĳ���ַ����Ƿ�Ϊ��
//		System.out.println(s8.isEmpty());
	}
	@Test
	public void test() {
		stringTest();
	}
}
