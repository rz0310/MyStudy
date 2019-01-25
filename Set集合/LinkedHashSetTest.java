package Set集合;
/*
 * 当遍历LinkedHashSet集合里的元素时，LinkedHashSet将会按元素的添加顺序来访问集合里的元素。
 * 因为LinkedHashSet需要维护元素的插入顺序，因此性能略低于HashSet的性能。但在迭代访问Set里的全部元素将有很好的性能，
 * 因为他以链表来维护内部顺序。
 */
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet books = new LinkedHashSet();
		books.add("疯狂java讲义");
		books.add("轻量级");
		System.out.println(books);
		books.remove("疯狂java讲义");
		books.add("疯狂java讲义");
		System.out.println(books);
	}
}
