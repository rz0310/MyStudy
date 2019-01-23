package Collection和Iterator接口;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args) {
//		创建集合
		Collection books = new HashSet();
//		给集合添加元素
		books.add(new String("轻量级JavaEE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂ios讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Andriod讲义"));
//		统计书名包含"疯狂"子串的图书数量
		System.out.println(calAll(books,a->((String)a).contains("疯狂")));
//		统计书名包含"Java"子串的图书数量
		System.out.println(calAll(books,ele->((String)ele).contains("Java")));
//		统计书名字符串长度大于10的图书数量
		System.out.println(calAll(books,ele->((String)ele).length()>10));
	}
	public static int calAll(Collection books,Predicate p) {
		int total = 0;
		for(Object obj : books) {
//			使用predicate的test()方法判断该对象是否满足Predicate指定的条件
			if(p.test(obj)) {
				total++;
			}
		}
		return total;
	}
}
