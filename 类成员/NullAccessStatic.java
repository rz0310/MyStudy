package ���Ա;

public class NullAccessStatic {
	public int age;
	public static String name;
	public static void main(String[] args) {
//		null�������ʵ����Ա,��������NullPointerException�쳣
//		NullAccessStatic n = null;
//		System.out.println(n.age);
		
//		���ǿ���ͨ��null�������������ľ�̬����
		NullAccessStatic n2 = null;
		System.out.println(n2.name);
	}
}
