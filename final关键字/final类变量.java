package final�ؼ���;

public class final����� {
//	��������final���ε������
//	final�����������ʽ��ָ����ʼֵ����ֻ��������λ��ָ��
	static final int age = 20;
	final static String s;
	final static double lg = 0.23;
//	���ʼ����
	static {
		s = "fkjava";
	}
//	ʵ����ʼ������Է������������������������������ֵ
	{
		System.out.println(s);
	}
	public static void test(){
//		final���ε��������������ͨ�����и�ֵ�����ǿ��Է��ʸñ���
//		lg = 30;
	}
}
