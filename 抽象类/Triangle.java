package 抽象类;

public class Triangle extends Shape {
//	定义三角形的三边
	private double a;
	private double b;
	private double c;
	public Triangle(String color,double a,double b,double c) {
		super(color);
		this.setSides(a, b, c);
	}
	public void setSides(double a,double b,double c) {
		if(a >= b + c || b >= a + c || c >= a + b) {
			System.out.println("三角形的两边之和必须大于第三边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
//	重写Shape类的两个方法
	@Override
	public double calPerimeter() {
		return a + b + c;
	}
	@Override
	public String getType() {
		return "三角形";
	}
}
