package ������;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal�ǳ�����,���ܴ�������
//		Animal an = new Animal();
		
		Animal.info();
		
		Animal an1 = new Bird();
		Animal an2 = new Camerl();
		an1.move();
		an2.move();
	}
}
