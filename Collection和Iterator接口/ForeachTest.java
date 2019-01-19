package Collection和Iterator接口;

import java.util.Collection;
import java.util.HashSet;

/*
 * 使用foreach循环遍历集合元素
 */
public class ForeachTest {
	public static void main(String[] args) {
//		创建一个集合
		Collection books = new HashSet();
		books.add("疯狂java讲义");
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Android讲义");
		for(Object obj : books) {
//			此处的book变量也不是集合元素本身
			String book = (String) obj;
			System.out.println(book);
			if(book.equals("疯狂java讲义")) {
//				下面代码将会引发ConcurrentModificationException异常
//				books.remove(book);
			}
		}
		System.out.println(books);
	}
}
