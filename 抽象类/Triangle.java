package ������;

public class Triangle extends Shape {
//	���������ε�����
	private double a;
	private double b;
	private double c;
	public Triangle(String color,double a,double b,double c) {
		super(color);
		this.setSides(a, b, c);
	}
	public void setSides(double a,double b,double c) {
		if(a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("�����ε�����֮�ͱ�����ڵ�����");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
//	��дShape�����������
	@Override
	public double calPerimeter() {
		return a + b + c;
	}
	@Override
	public String getType() {
		return "������";
	}
}
