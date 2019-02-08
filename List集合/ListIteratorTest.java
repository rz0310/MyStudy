package List集合;
/*
 * ListIterator增加了向前迭代的功能（Iterator只能向后迭代），而且ListIterator还可通过add()方法向List集合中添加元素（Iterator只能删除元素）。
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	public static void main(String[] args) {
		String[] books = {"疯狂java讲义","疯狂IOS讲义","轻量级Java EE企业应用实战"};
		List booklist = new ArrayList();
		for(int i=0;i<books.length;i++) {
			booklist.add(books[i]);
		}
		System.out.println(booklist);
//		lit时booklist的迭代器
//		listIterator()方法返回一个listIterator对象
		ListIterator lit = booklist.listIterator();
//		System.out.println(lit.next());
		while(lit.hasNext()) {
			System.out.println(lit.next());
			lit.add("---------分隔符---------");
		}
		System.out.println("=======下面开始反向迭代=======");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
