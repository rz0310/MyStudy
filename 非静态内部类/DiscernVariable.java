package �Ǿ�̬�ڲ���;
//***�����ⲿ��ĳ�Ա����,�ڲ���ĳ�Ա����,�Լ��ڲ���ľֲ�����
/*
 * ���ڷǾ�̬�ڲ���ķ����ڷ���ĳ������ʱ,ϵͳ�����ڸ÷����ڲ����Ƿ���ڸ����ֵľֲ�����,������ھ����øñ���;
 * ���������,�򵽸÷������ڵ��ڲ����в����Ƿ���ڸ����ֵĳ�Ա���������������ʹ�øó�Ա����;
 * ���������,�򵽸��ڲ������ڵ��ⲿ���в����Ƿ���ڸ����ֵĳ�Ա����,���������ʹ�øó�Ա����;
 * �����Ȼ������,ϵͳ�����ֱ������
 */
public class DiscernVariable {
	private String prop = "�ⲿ���ʵ������";
	private class Inclass {
//		private String prop = "�ڲ����ʵ������";
		public void info() {
//			String prop = "�ڲ���ľֲ�����";
//			ͨ���ⲿ�������.this.varName�����ⲿ���ʵ������
			System.out.println("�ⲿ���ʵ��������"+DiscernVariable.this.prop);
//			ͨ��this.varName�����ڲ����ʵ������
//			System.out.println("�ڲ����ʵ��������"+this.prop);
//			ֱ�ӷ��ʾֲ�����
			System.out.println("�ڲ���ľֲ�������"+prop);
		}
	}
	public void test() {
		Inclass i = new Inclass();
		i.info();
	}
	public static void main(String[] args) {
		DiscernVariable dv = new DiscernVariable();
		dv.test();
	}
}
