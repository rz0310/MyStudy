package ���������빹��������;

import javax.swing.JFrame;

/*
 * Lambda���ʽֻ��һ�����룬�Ϳ����ڴ������ʹ�÷������ú͹��������á�
 */
public class Test {
	@FunctionalInterface
	interface Converter {
		Integer convert(String from);
	}
	@FunctionalInterface
	interface MyTest {
		String test(String a,int b,int c);
	}
	@FunctionalInterface
	interface YourTest {
		JFrame win(String title);
	}
	public static void main(String[] args) {
//		1.�����෽��(Lambda���ʽ�е�Integer�����Ǹ���)
//		�ó����е�13��17�д���ȼ�
		Converter converter = from->Integer.valueOf(from);//13
		Integer val = converter.convert("99");
		System.out.println(val);
//		����һ�д��������෽��
		Converter converter1 = Integer::valueOf;//17
		Integer val1 = converter1.convert("99");
		System.out.println(val1);
//		2.�����ض������ʵ������(Lambda���ʽ�е��ַ���"fkit.org"�ʹ����ض�����)
		Converter converter2 = from->"fkit.org".indexOf(from);
		Integer val2 = converter2.convert("it");
		System.out.println(val2);
		Converter converter22 = "fkit.org"::indexOf;
		Integer val22 = converter22.convert("it");
		System.out.println(val22);
//		3.����ĳ������ʵ������(Lambda���ʽ�е�a�ʹ���ĳһ�����)
		MyTest mt = (a,b,c)->a.substring(b, c);
//		substring(a,b):��aλ�ÿ�ʼ��������a������bλ�ã�����b��
		String str = mt.test("Java I love you", 5, 15);
		System.out.println(str);
//		���������ʵ���������ã�Ҳ���ǵ���ĳ��String�����substring������ʵ��MyTest��Ψһ�ĳ��󷽷�
		// �������ô���Lambda���ʽ������ĳ������ʵ������
		// ����ʽ�ӿ��б�ʵ�ֵķ����ĵ�һ��������Ϊ�����ߣ�����Ĳ���ȫ�������÷�����Ϊ����
		MyTest mt1 = String::substring;
		String str1 = mt1.test("Java I love you", 5, 15);
		System.out.println(str1);
//		4.���ù�����
		YourTest yt = (String a)->new JFrame(a);
		JFrame jf = yt.win("�ҵĴ���");
		System.out.println(jf);
		// ���������ô���Lambda���ʽ
		// ����ʽ�ӿ��б�ʵ�ַ�����ȫ�����������ù�������Ϊ����
		YourTest yt1 = JFrame::new;
		JFrame jf1 = yt1.win("�ҵĴ���1");
		System.out.println(jf1);
	}
}
