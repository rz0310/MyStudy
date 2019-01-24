package Set集合;

/*
 * EnumSet中的所有元素都必须是指定类型的枚举值，该枚举类型在创建时显式或隐式的指定。EnumSet集合元素也是有序的，以枚举值在Enum类里的定义顺序来决定集合元素的顺序。
 * EnumSet在内部以位向量的形式存储，这种存储方式紧凑、高效。因此EnumSet对象占用内存很小，而且运行效率很好。
 * EnumSet不允许插入null元素，如果插入，会抛出NullPointerException。
 */
import java.util.EnumSet;

enum Season {
	SPRING,SUMMER,FALL,WINTER;
}

public class EnumSetTest {
	public static void main(String[] args) {
//		创建一个EnumSet集合，集合元素就是Season枚举类的全部枚举值。
		EnumSet es1 = EnumSet.allOf(Season.class);
		System.out.println(es1);
//		创建一个EnumSet空集合，指定集合元素是Season类的枚举值。
		EnumSet es2 = EnumSet.noneOf(Season.class);
		System.out.println(es2);
//		手动添加两个元素
		es2.add(Season.WINTER);
		es2.add(Season.SPRING);
//		下面代码会引发空指针异常
//		es2.add(null);
//		按枚举类开始定义的顺序输出
		System.out.println(es2);
//		以指定枚举值创建EnumSet集合
		EnumSet es3 = EnumSet.of(Season.SPRING,Season.WINTER);
		System.out.println(es3);
//		以指定范围的枚举值创建Enumset集合
		EnumSet es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println(es4);
//		新创建的集合元素与es4有相同类型的集合元素,且es4集合元素+es5集合元素=Season类全部的枚举值
		EnumSet es5 = EnumSet.complementOf(es4);
		System.out.println(es5);
	}
}
