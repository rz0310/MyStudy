package practice;

public class FinalLocalVariableTest {
	public void test(final int a){
//		���ܶ�final���ε��βθ�ֵ,�������
//		a = 5;
	}
	public static void main(String[] args){
//		����final�ֲ�����ʱ,ָ����ʼֵ����str�����޷����¸�ֵ
		final String str = "hello";
//		��������Ƿ�
//		str = "java";
//		����final�ֲ�����ʱ,û��ָ����ʼֵ,��ñ����ɱ���ֵһ��
		final double d;
		d = 5.6;
//		�ٴθ�ֵ�Ƿ�
//		d = 5.4;
	}
}
