package 抽象类;

public class Circle extends Shape{
	private double radius;
	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}
	public void setSides(double radius) {
		this.radius = radius;
	}
	public String getType() {
		return "圆";
	}
	public double calPerimeter() {
		return 2*Math.PI*radius;
	}
	public static void main(String[] args) {
		Shape s1 = new Triangle("黄色",2,3,4);
		Shape s2 = new Circle("红色",5);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
}
