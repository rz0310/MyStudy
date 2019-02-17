package Map集合;
/*
 * EnumMap是一个与枚举类一起使用的Map实现，EnumMap中的所有key都必须是单个枚举类的枚举值。
 * 创建EnumMap必须显式或者隐式指定它对应的枚举类。
 * EnumMap有以下特征：
 * （1）在内部以数组的形式保存，所以种实现形式非常紧凑、高效。
 * （2）EnumMap根据key的自然顺序（即）枚举值在枚举类中的定义顺序来维护key-value对的顺序。
 * （3）EnumMap不允许使用null来作为key，如果使用了将抛出NullPointerException异常，但允许null作为value。
 * 注意：创建一个EnumMap时必须指定一个枚举类，从而将该EnumMap和指定枚举类联系起来。
*/
import java.util.EnumMap;

enum Season {
	SPRING,SUMMER,FALL,WINTER;
}
class EnumMapTest {
	
	public static void main(String[] args) {
//		创建EnumMap对象，该EnumMap对象的所有key都是season枚举类的枚举值
		EnumMap em = new EnumMap(Season.class);
		em.put(Season.SUMMER, "夏日炎炎");
		em.put(Season.SPRING, "春暖花开");
		System.out.println(em);
	}
}
