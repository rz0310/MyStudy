package ��̬�ڲ���;
/*
 * �����static������һ���ڲ���,��ô����ڲ���������ⲿ�౾��,���������ⲿ���ĳ������
 * ���ʹ��static���ε��ڲ����Ϊ���ڲ���,Ҳ�ɾ�̬�ڲ��ࡣ
 * ע�⣺static�ؼ��ֵ������ǰ���ĳ�Ա�������ء�������ʵ����ء�
 * 
 * ��̬�ڲ�����԰�����̬��ԱҲ���԰����Ǿ�̬��Ա�����ݾ�̬��Ա���ܷ��ʷǾ�̬��Ա�Ĺ���,��̬�ڲ��಻�ܷ����ⲿ���ʵ����Ա,ֻ�ܷ����ⲿ������Ա��
 * ��ʹ�Ǿ�̬�ڲ����ʵ������Ҳ���ܷ����ⲿ��ľ�̬��Ա��
 * 
 * ��̬�ڲ����ʵ���������ܷ����ⲿ���ʵ�����ԣ�ԭ�����£�
 * 	��Ϊ��̬�ڲ�������ⲿ�������ص�,�������ⲿ��Ķ�����صġ�Ҳ����˵����̬�ڲ�������Ǽ������ⲿ���ʵ���У����Ǽ������ⲿ����౾���С�
 * ����̬�ڲ���������ʱ����������һ�������������ⲿ�����,��̬�ڲ������ֻ�����ⲿ��������ã�û�г����ⲿ���������á�
 * �������̬�ڲ����ʵ�����������ⲿ���ʵ����Ա�����Ҳ������������ⲿ����󣬽��������
 * 
 * ע�⣺java�������ڽӿ��ж����ڲ���,�ڽӿ��ж����ڲ���Ĭ��ʹ��public static����,�����ӿ��ڲ��ֻࣩ���Ǿ�̬�ڲ��ࡣ
 */
public class StaticInnerClassTest {
	private int prop1 = 5;
	private static int prop2 = 6;
	static class StaticInnerClass {
//		��̬�ڲ����п��԰�����̬��Ա
		private static int age;
		public void accessOuterProp() {
//			��̬�ڲ����޷������ⲿ���ʵ������,����������
//			System.out.println(prop1);
//			��̬�ڲ��಻�ܷ����ⲿ���ʵ����Ա,ֻ�ܷ����ⲿ��ľ�̬��Ա
			System.out.println(prop2);
//			�������ⲿ������������ⲿ��ľ�̬��Ա,���ǲ������ڲ����ʵ����Ա�����ⲿ��ľ�̬����,��Ϊ�ⲿ��ľ�̬�����������ڲ���
			StaticInnerClass s = new StaticInnerClass();
//			System.out.println(s.prop2);
			System.out.println(StaticInnerClassTest.prop2);
		}
	}
	public static void main(String[] args) {
		StaticInnerClassTest s1 = new StaticInnerClassTest();
		StaticInnerClass s2 = new StaticInnerClass();
		System.out.println(s1.prop2);
		System.out.println(StaticInnerClassTest.prop2);
	}
}







