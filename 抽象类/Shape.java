package ������;

public abstract class Shape {
	{
		System.out.println("ִ��Shape�ĳ�ʼ����...");
	}
	private String color;
//	����һ�������ܳ��ĳ��󷽷�
	public abstract double calPerimeter();
//	����һ��������״�ĳ��󷽷�
	public abstract String getType();
//	����Shape��Ĺ�����,������������Shape����,�������ڱ��������
	public Shape() {
		
	}
	public Shape(String color) {
		System.out.println("ִ��Shape��Ĺ�����");
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
