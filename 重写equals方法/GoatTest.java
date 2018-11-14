package 练习;

public class GoatTest {
	public static void main(String[] args) {
		Goat gt1 = new Goat("黑色",78.2);
		Goat gt2 = new Goat("黑色",78.2);
		System.out.println(gt1 == gt2);
		System.out.println(gt1.equals(gt2));
//		String和Date等,重写了object的equals()方法,
//		例如:x.equals(y),当x和Y引用的是同一类对象且属性内容相等时(并不一定是相同对象),返回true,否则返回false
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2));
	}
}
