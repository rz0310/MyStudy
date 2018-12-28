package Lambda表达式;
/*
 * Lambda表达式实际上会被当成任意类型的对象
 */
interface Eatable {
	void taste();
}
interface Flyable {
	void fly(String weather);
}
interface Addable {
	int add(int a, int b);
}

public class LambdaQS {
//	调用taste方法需要Eatable对象
	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}
//	调用drive方法需要Flyable对象
	public void drive(Flyable f) {
		System.out.println("我正在驾驶："+f);
		f.fly("碧空如洗的晴日");
	}
//	调用test方法需要Addable对象
	public void test(Addable add) {
		System.out.println("5+3="+add.add(5, 3));
	}
	public static void main(String[] args) {
		LambdaQS lq = new LambdaQS();
//		此处eat方法的参数就是一个Lambda表达式
//		代码块只有一条语句，可以省略花括号
		lq.eat(()->System.out.println("苹果的味道真不错"));
//		形参列表只有一个形参，可以省略花括号
		lq.drive(weather->
		{
			System.out.println("今天的天气是："+weather);
			System.out.println("直升机飞行平稳");
		});
//		只有一条语句，可以省略花括号，即使该表达式需要返回值，也可以省略return关键字
		lq.test((a,b)->a+b);
	}
}
