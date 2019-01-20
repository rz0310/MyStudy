package Collection和Iterator接口;

/*
 * Iterator迭代器采用的是快速失败（fail-fast）机制，一旦在迭代过程中检测到该集合已经被修改（通常是程序中的其他线程修改），
 * 程序就会引发java.util.ConcurrentModificationException异常，而不是显示修改后的结果，这样可以避免共享资源而引发的潜在问题。
 */

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
	public static void main(String[] args) {
//		创建一个集合
		Collection books = new HashSet();
		books.add("疯狂java讲义");
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Android讲义");
//		获取books集合对应的迭代器
		Iterator it = books.iterator();
		while(it.hasNext()) {
//			it.next()方法返回的数据类型是Object类型，因此需要强制类型转换
			String book = (String) it.next();
			System.out.println(book);
			if(book.equals("疯狂java讲义")) {
//				使用Iterator迭代器的过程中，不可修改集合元素，下面代码引发异常
				books.remove(book);
			}
		}
	}
}
