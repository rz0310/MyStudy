package 抽象类;

public abstract class Animal {
	private int age;
	public Animal() {
		
	}
	public Animal(int age) {
		this.age = age;
	}
	public static void info() {
		System.out.println("Animal的info方法");
	}
	public abstract void move();
}
