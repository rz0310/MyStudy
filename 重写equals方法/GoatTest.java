package ��ϰ;

public class GoatTest {
	public static void main(String[] args) {
		Goat gt1 = new Goat("��ɫ",78.2);
		Goat gt2 = new Goat("��ɫ",78.2);
		System.out.println(gt1 == gt2);
		System.out.println(gt1.equals(gt2));
//		String��Date��,��д��object��equals()����,
//		����:x.equals(y),��x��Y���õ���ͬһ������������������ʱ(����һ������ͬ����),����true,���򷵻�false
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));
	}
}
