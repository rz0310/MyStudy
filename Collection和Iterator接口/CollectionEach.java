package Collection和Iterator接口;
/*
 * 使用Lambda表达式遍历集合
 */
import java.util.Collection;
import java.util.HashSet;
/*
 * 以下程序中的最后一行代码调用了Iterable的foreach()方法来遍历集合元素，传给该方法的是一个Lambda表达式，
 * 该表达式的目标类型是Comsumer。foreach()方法会自动将集合元素逐个地传给Lambda表达式的形参。
 */
public class CollectionEach {
	public static void main(String[] args) {
//		创建一个集合
		Collection books = new HashSet();
		books.add("疯狂java讲义");
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Android讲义");
//		调用foreach方法遍历集合
		books.forEach(obj->System.out.println("迭代集合元素："+obj));
	}
}
