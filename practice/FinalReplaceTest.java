package practice;

public class FinalReplaceTest {
	public static void main(String[] args) {
		final int a = 5;
		final double d = 1.2/3;
		final String str = "���" + "java";
		final String book = "���java���壺" + 99.0;

//		����book2������ָ��Ϊ�����˷���,�����ڱ���ʱ,�޷�ȷ������
		final String book2 = "���java���壺" + String.valueOf(99.0);
		System.out.println(book == "���java���壺99.0;");
		System.out.println(book2 == "���java���壺99.0;");
	}
}
