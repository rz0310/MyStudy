package ������;

public abstract class Animal {
	private int age;
	public Animal() {
		
	}
	public Animal(int age) {
		this.age = age;
	}
	public static void info() {
		System.out.println("Animal��info����");
	}
	public abstract void move();
}
