package ��������ϰ;
/*
 * 1.ͨ�������ඨ�峵���ģ�棬Ȼ��ͨ������ĳ���������������������С�γ���
 */
public abstract class Vehicle {
//	����
	private double speed;
//	������ɫ
	private String color;
//	���Ĵ�С
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
		System.out.println("���ɳ�����·��");
	}
	public abstract void myFunction();
	
}
