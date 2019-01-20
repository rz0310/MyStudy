package Collection和Iterator接口;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {
	public static void main(String[] args) {
//		创建一个集合
		Collection books = new HashSet();
		books.add("疯狂java讲义");
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Android讲义");
//		获取books集合对应的迭代器
		Iterator it = books.iterator();
//		使用Lambda表达式(目标类型是Comsumer)来遍历集合
//		该Lambda表达式的目标类型是Comsumer,下面一行代码也可用于遍历集合元素
		it.forEachRemaining(obj->System.out.println("迭代集合元素："+obj));
	}
}
