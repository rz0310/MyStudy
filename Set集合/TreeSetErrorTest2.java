package Set集合;
/*
 * 如果希望TreeSet能正常运作，只能添加同一种类型的对象。
 * 
 * 当把一个对象加入TreeSet集合中，TreeSet调用该集合的compareTo()方法与容器中的其他对象比较大小，然后根据红黑树结构找到它的存储位置。
 * 如果两个对象通过compareTo(Object obj)方法比较相等，新对象将无法添加到TreeSet集合中。
 */
import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrorTest2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("疯狂java讲义");
		System.out.println(ts);
		
//		注意：向TreeSet集合中添加的应该是同一个类的对象，否则也会引发java.lang.ClassCastException异常
//		ts.add(new Date());
		
//		注意：如果两个对象通过compareTo(Object obj)方法比较相等，新对象将无法添加到TreeSet集合中。
//		ts.add("疯狂java讲义");
//		System.out.println(ts);
//		ts.add(new String("疯狂java讲义"));
//		System.out.println(ts);
		
	}
}
