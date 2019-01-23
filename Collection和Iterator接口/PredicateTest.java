package Collection和Iterator接口;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
	/*
	 * 下面程序中粗体字代码调用了Collection集合deremoveIf()方法批量删除集合中符合条件的元素，
	 * 程序传入一个Lambda表达式作为过滤条件：所有长度小于10的字符串元素都会被删除。
	 */
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add(new String("轻量级JavaEE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂ios讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Andriod讲义"));
//		使用Lambda表达式（目标类型是Predicate）过滤集合
		books.removeIf(ele->((String)ele).length()<10);
		System.out.println(books);
	}
}
