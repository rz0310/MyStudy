package �ӿ�;

public interface OutPut {
//	�ӿ��ﶨ��ĳ�Ա����ֻ���ǳ���
	int Max_Cache_Line = 50;
//	�ӿ��ﶨ�����ͨ����ֻ����public�ĳ��󷽷�
	void out();
	void getData(String msg);
//	�ڽӿ��ж������ͨ����,��Ҫ��default����
	default void print(String... msgs) {
		for(String msg : msgs) {
			System.out.println(msg);
		}
	}
//	�ڽӿ��ж���Ĭ�Ϸ���,��Ҫ��default����
	default void test() {
		System.out.println("Ĭ�ϵ�test����");
	}
	static String staticTest() {
		return "�ӿ�����෽��";
	}
//	java9֧�ִ��������˽�з���~~~~~~~
//	����˽�з���
//	private void foo() {
//		System.out.println("foo˽�з���");
//	}
////	����˽�о�̬����
//	private static void bar() {
//		System.out.println("foo��̬˽�з���");
//	}
}
