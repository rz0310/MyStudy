package Interface接口;

public class Dog implements Eatable,Moveable{
	public void taste() {
		System.out.println("狗肉真好吃");
	}
	public void move() {
		System.out.println("狗在跑");
	}
}
