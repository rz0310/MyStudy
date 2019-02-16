package List集合;

import java.util.ArrayList;
import java.util.List;

/*
 * List集合代表一个
 */
public class ListTest {
	public static void main(String[] args) {
		List books = new ArrayList();
//		向books集合中添加三个元素
		books.add(new String("轻量级Java EE企业应用实战"));
		books.add(new String("疯狂java讲义"));
		books.add(new String("疯狂Andriod讲义"));
		System.out.println(books);
//		将新字符串对象插入到第二个位置
		books.add(1, new String("疯狂Ajax讲义"));
		System.out.println(books);
		for(int i=0;i<books.size();i++) {
			System.out.println(books.get(i));
		}
//		删除第三个元素
		books.remove(2);
		System.out.println(books);
//		判断指定元素在集合中的位置：输出1，表明位于第二位
		System.out.println(books.indexOf(new String("疯狂Ajax讲义")));
//		将第二个元素替换成新的字符串对象
		books.set(1, new String("疯狂java讲义"));
		System.out.println(books);
//		将books集合的第二个元素（包括），到第三个元素（不包括）截取成子集合
		System.out.println(books.subList(1, 2));
	}
}
