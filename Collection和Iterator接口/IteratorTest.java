package Collection和Iterator接口;
/*
 * 使用java8增强的Iterator遍历集合元素
 * Iterator仅用于遍历集合元素，其本身并不提供承装对象的能力。
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
//		创建一个集合
		Collection books = new HashSet();
		books.add("疯狂java讲义");
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Android讲义");
		Iterator it = books.iterator();
		while(it.hasNext()) {
//			it.next()方法返回的数据类型是Object类型，因此需要强制类型转换
			String book = (String) it.next();
			System.out.println(book);
			if(books.equals("疯狂java讲义")) {
//				从集合中删除上一次next返回的元素
				it.remove();
			}
//			对book变量赋值，不会改变集合元素本身
			book = "测试字符串";
		}
		System.out.println(books);
	}
}
