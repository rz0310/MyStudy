package ��̬�ڲ���;
/*
 * ��̬�ڲ������ⲿ���һ����̬��Ա,����ⲿ������з��������г�ʼ�����п���ʹ�þ�̬�ڲ�����������󡢴��������ȡ�
 * 
 * �ⲿ����Ȼ����ֱ�ӷ��ʾ�̬�ڲ���ĳ�Ա��������ʹ�þ�̬�ڲ����������Ϊ�����������ʾ�̬�ڲ�������Ա��
 * Ҳ����ʹ�þ�̬�ڲ�����󣨼���̬�ڲ����ʵ����Ա����Ϊ�����������ʾ�̬�ڲ����ʵ����Ա��
 */
public class AccessStaticInnerClass {
	static class StaticInnerClass {
		private static int prop1 = 5;
		private int prop2 = 9;
	}
	public void accessInnerProp() {
//		����������,�ⲿ�಻��ֱ�ӷ��ʾ�̬�ڲ���ĳ�Ա,Ӧ��ͨ���������ʻ����Ծ�̬�ڲ���Ķ�����Ϊ������
//		System.out.println(prop1);
		StaticInnerClass s = new StaticInnerClass();
//		��������
		System.out.println(StaticInnerClass.prop1);
//		�������
		System.out.println(s.prop1);
	}
}
