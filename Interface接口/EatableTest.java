package Interface接口;

public interface EatableTest {
	public static void main(String[] args) {
//		接口访问类变量
		System.out.println(Eatable.MAX_PRESERVE);
//		接口调用类方法
		Eatable.test();
		
//		接口是抽象的，不能直接派生子类。
//		要用实现类的实例来赋值(向上转型)
//		Eatable ea = new Eatable();
		
//		接口类型的变量,只能用接口的实现类赋值。向上转换
		Eatable ea1 = new Dog();
		ea1.taste();
//		ea1的编译时类型是Eatable，编译器编译时认为他是Eatable类型,所以没有move()方法
//		ea1.move();
		if(ea1 instanceof Eatable) {
			Dog dg = (Dog)ea1;
			dg.move();
		}
//		PigFootRice类只继承了Eatable类,故只实现Eatable类中的抽象方法即可
		Eatable ea2 = new PigFootRice();
		ea2.taste();
	}
	
}
