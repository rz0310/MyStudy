package �Ǿ�̬�ڲ���;
/*
 * 1.�ڲ������Ҫ���ã�
 * ��1���ڲ����Ա����ֱ�ӷ����ⲿ���˽������,��Ϊ�ڲ��౻�������ⲿ��ĳ�Ա,
 * ͬһ����ĳ�Ա֮����Ի������.���ⲿ�಻�ܷ����ڲ����ʵ��ϸ��,�����ڲ���ĳ�Ա������
 * ��2���ڲ����Ա����ֱ�ӷ����ⲿ���˽������,��Ϊ�ڲ��౻�������ⲿ��ĳ�Ա,ͬһ����ĳ�Ա֮�� ���Ի������.
 * ���ⲿ�಻��ֱ�ӷ����ڲ����ʵ��ϸ��,�����ڲ���ĳ�Ա������
 * ��3�������ڲ����ʺ����ڴ�����Щ����Ҫһ��ʹ�õ��ࡣ
 * 2.�ڲ�����ⲿ������𣺣������﷨��������,�ڲ��������Ҫ����������������棩
 * ��1���ڲ�����ⲿ����������η���private,protected,static�����ⲿ�಻����ʹ�����������η���
 * ��2���Ǿ�̬�ڲ��಻��ӵ�о�̬��Ա��
 * 3.�󲿷�ʱ���ڲ��඼����Ϊ��Ա�ڲ��ඨ��,��������Ϊ�ֲ��ڲ��ࡣ
 * ��Ա�ڲ������Ա����,��Ա����,�������ͳ�ʼ�������Ƶ����Ա���ֲ��ڲ���������ڲ����������Ա��
 * 4.��Ա�ڲ����Ϊ���Ǿ�̬�ڲ���;�̬�ڲ���,ʹ��static���ε��Ǿ�̬�ڲ���,û��ʹ��static���εĳ�Ա�ڲ����ǷǾ�̬�ڲ��ࡣ
 * 5.�ڲ������ĸ�������ͬһ������ default����ͬһ���ࣨprivate���������ࣨprotected�����κ�λ�ã�public���� 
 * 6.��������������class�ļ�,һ�����ⲿ������.class,��һ�����ⲿ������$�ڲ�������.class��
 * ����Ա�ڲ��ࣨ������̬�ڲ���ͷǾ�̬�ڲ��ࣩ��class�ļ����ǣ�OuterClass$InnerClass.class��
 * 7.ע�⣺�����÷Ǿ�̬�ڲ����ʵ������ʱ,������һ���Ǿ�̬�ڲ���ʵ��,�Ǿ�̬�ڲ���ʵ������������ⲿ���ʵ���
 */
public class Cow {
	private double weight;
//	�ⲿ���������صĹ�����
	public Cow() {}
	public Cow(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
//	����һ���Ǿ�̬�ڲ���
	private class Cowleg {
		private String color;
		private double length;
		public Cowleg() {}
		public Cowleg(String color,double length) {
			this.color = color;
			this.length = length;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
//		�Ǿ�̬�ڲ����ʵ������
		public void info() {
			System.out.println("��ǰţ����ɫΪ��"+color+",�ߣ�"+length);
			System.out.println("��ţ��Ϊ��"+weight);
		}
	}
	public void test() {
		Cowleg cl = new Cowleg("�ڰ�ɫ",120);
		cl.info();
	}
	public static void main(String[] args) {
		Cow c = new Cow(80);
		c.test();
	}
}
