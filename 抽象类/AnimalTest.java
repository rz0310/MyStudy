package 抽象类;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal是抽象类,不能创建对象
//		Animal an = new Animal();
		
		Animal.info();
		
		Animal an1 = new Bird();
		Animal an2 = new Camerl();
		an1.move();
		an2.move();
	}
}
