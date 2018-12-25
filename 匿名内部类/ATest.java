package �����ڲ���;

interface A {
	void test();
}
/*
 * ��java8֮ǰ��javaҪ�󱻾ֲ��ڲ��ࡢ�����ڲ�����ʵľֲ���������ʹ��final���Σ�
 * java8֮������ֲ������������ڲ�����ʣ���ô�þֲ������൱���Զ�ʹ����final���Ρ�
 */
public class ATest {
	
	public static void main(String[] args) {
		int age = 8;
		A a = new A() {
			public void test() {
	//			��java8��ǰ������佫��ʾ����,age����ʹ��final����
	//			��java8��ʼ,�����ڲ���,�ֲ��ڲ���������ʷ�final�ľֲ�����
				System.out.println(age);
			}
		};
		a.test();
}
