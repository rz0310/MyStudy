package Set集合;
/*
 * 注意：当复制一个Collection集合里的元素来创建EnumSet集合时，必须保证Collection集合里的所有元素都是同一个枚举类的枚举值。
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest2 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		System.out.println(c);
		c.clear();
		System.out.println(c);
		c.add(Season.FALL);
		c.add(Season.WINTER);
//		复制c集合里面的所有元素来创建EnumSet集合
		EnumSet enumset = EnumSet.copyOf(c);
		System.out.println(enumset);
		c.add("疯狂java讲义");
//		下面代码发生异常 java.lang.ClassCastException，因此c集合里面的元素不全是枚举类。
//		enumset.copyOf(c);
	}
}
