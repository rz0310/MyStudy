package 抽象类练习;
/*
 * 1.通过抽象类定义车类的模版，然后通过抽象的车类派生拖拉机、卡车、小轿车。
 */
public abstract class Vehicle {
//	车速
	private double speed;
//	车的颜色
	private String color;
//	车的大小
	private int size;
	public Vehicle() {
		
	}
	public Vehicle(double speed,String color,int size) {
		this.speed = speed;
		this.color = color;
		this.size = size;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void run() {
		System.out.println("车飞驰在马路上");
	}
	public abstract void myFunction();
	
}
