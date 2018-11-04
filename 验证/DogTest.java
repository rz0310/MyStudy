package 课堂练习;

public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("旺财","灰色");
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		
		Dog d2 = new Dog("旺财","灰色",3);
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getAge());
	}
}
