package ����ģʽ;

public class SingletonTest {
	public static void main(String[] args) {
//		��ΪSingleton��Ĺ����������أ����Բ��ܴ���ʵ���������������������
//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.instance();
		Singleton s2 = Singleton.instance();
		System.err.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
