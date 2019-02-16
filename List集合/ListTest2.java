package List集合;
/*
 * 当要删除List集合中的一个对象时，List将会调用该A对象的equals()方法依次与集合元素比较，如果返回true，List将会删除该元素。
 * 
 * 注意：当调用List的set(int index,Object element)方法来改变List集合指定索引处的元素时，
 * 指定的索引必须是List集合的有效索引。即该方法不会改变List集合的长度。
 */
import java.util.ArrayList;
import java.util.List;

class A {
	public boolean equals(Object obj) {
		return true;
	}
}

public class ListTest2 {
	public static void main(String[] args) {
		List books = new ArrayList();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂java讲义"));
		books.add(new String("疯狂Andriod讲义"));
		System.out.println(books);
//		每次删除list集合中的A对象时，总是删除List集合中的第一个元素
//		删除集合中的A对象,将导致集合中的第一个元素被删除
		books.remove(new A());
		System.out.println(books);
//		删除集合中的A对象，再次删除集合中的第一个元素
		books.remove(new A());
		System.out.println(books);
	}
}
