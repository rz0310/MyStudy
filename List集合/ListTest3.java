package List集合;
/*
 * Java8为List提供了两个默认的方法：sort()和replaceAll()。其中sort()方法需要一个Comparator对象来控制元素排序，
 * 可用Lambda表达式来作为参数；而replaceAll()则需要一个UnaryOperator来替换所有元素集合，他也是一个函数式接口，
 * 也可用Lambda表达式作为参数。
 */
import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		List books = new ArrayList();
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂java讲义"));
		books.add(new String("疯狂Andriod讲义"));
		books.add("疯狂IOS讲义");
		System.out.println(books);
//		使用目标类型为Comparator的Lambda表达式堆List集合排序
		books.sort((o1,o2)->((String)o1).length()-((String)o2).length());
		System.out.println(books);
		books.replaceAll(ele->((String)ele).length());
		System.out.println(books);
	}
}
