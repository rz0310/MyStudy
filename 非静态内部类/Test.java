package �Ǿ�̬�ڲ���;

public class Test {
	public void test() {
		System.out.println("��������");
	}
	public static void main(String[] args) {
//		��������,������main(static)������ʹ�ø���Ķ�����ø���ķ�static����
//		���ǲ���ֱ����main(static)������ֱ�ӵ��÷�static����
		Test t = new Test();
		t.test();
//		test();
	}
}
