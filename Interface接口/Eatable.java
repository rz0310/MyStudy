package Interface�ӿ�;

public interface Eatable {
//	���г�Ա����ǰĬ����public static final
	int MAX_PRESERVE = 100;
//	���󷽷�ǰĬ����public abstract
	void taste();
//	java8֮��,�ӿ��п��Զ���static����,���нӿ��п���дmain����
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
//	�෽�������з�����
	static void test() {
		System.out.println("�෽��test");
	}
//	java8֮��default��Ϊ�˸�ʵ��������ӷ�����
//	default��Ϊ�����ֳ��󷽷���Ĭ�Ϸ���,����ԭ����abstract�ؼ���
	default void info() {
		System.out.println("");
	}
}
