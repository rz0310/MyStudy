package Collection和Iterator接口;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
//		添加元素
		c.add("孙悟空");
//		虽然集合里不能放基本类型的值，但是java支持自动装箱
		c.add(6);
		System.out.println("c集合元素的个数为："+c.size());//输出2
//		删除指定元素
		c.remove(6);
		System.out.println("c集合元素的个数为："+c.size());//输出1孙
//		判断是否包含指定字符串
		System.out.println(c.contains("孙悟空"));
		c.add("猪八戒");
		System.out.println("c集合的元素："+c);
		Collection books = new HashSet();
		books.add("猪八戒");
		System.out.println("c集合是否完全包含books集合："+c.containsAll(books));//输出false
//		用集合c减去books里面的所有元素
		c.removeAll(books);
		System.out.println("c集合里的元素："+c);
//		删除c集合里面的所有元素
		c.clear();
		System.out.println("c集合里的元素："+c);
//		控制books集合里面只剩下c集合里也包含的元素
		books.retainAll(c);
		System.out.println("books集合的元素："+books);
	}
}
