package �Ǿ�̬�ڲ���;
/*
 * �Ǿ�̬�ڲ���ĳ�Աֻ�ڷǾ�̬�ڲ���ķ�Χ���ǿ�֪��,�����ܱ��ⲿ��ֱ��ʹ�á�
 * ����ⲿ����Ҫ���ʷǾ�̬�ڲ���ĳ�Ա,�������ʽ�����Ǿ�̬�ڲ�����������÷��ʷǾ�̬�ڲ���ĳ�Ա������
 */
public class Outer {
	private int outProp = 9;
//	�ڲ���
	private class inner {
		private int inProp = 9;
		public void accessOuterProp() {
//		�Ǿ�̬�ڲ������ֱ�ӷ����ⲿ���private��Ա����,ͨ������.this.��Ա����
			System.out.println(Outer.this.outProp);
		}
	}
	
	public void accessInnerProp() {
//		���ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����private��Ա����
//		System.out.println(inProp);
//		�����Ҫ����,������ʽ�Ĵ����ڲ���Ķ���
		System.out.println("�ڲ����inPropֵ��"+new inner().inProp);
	}
	public static void main(String[] args) {
//		��������,������main(static)������ʹ�ø���Ķ�����ø���ķǾ�̬����~~~~~~~~~~~~
		Outer o = new Outer();
//		�������ֻ�������ⲿ��Ķ���,��δ�����ڲ���Ķ���
		o.accessInnerProp();
	}
}
