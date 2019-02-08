package List集合;
/*
 * ArrayList和Vector实现类（List的实现类）：
 * 		ArrayList和Vector都是基于数组实现的List类，两者都提供了一个动态的允许在分配的Object[]数组。ArrayList和Vector对象
 * 		使用initialCapacity参数来设置数组的长度，当向ArrayList和Vector中添加元素超出了数组的长度时，他们的initialCapacity会自动增加。
 * 		如果向其中添加大量元素时，可使用ensureCapacity(int Capacity)方法一次性的增加initialCapacity。从而减少重分配的次数，提高性能。
 * 		如果创建空的ArrayList和Vector不指定initialCapacity,则object[]数组的长度默认为10。
 * 
 * ArrayList和Vector的显著区别：
 * 		ArrayList时线程不安全的，当有多个线程访问同一个ArrayList集合时，如果有超过一个线程修改了ArrayList集合，则程序必须手动保证该集合的同步性。
 * 		Vector时线程安全的，无须程序保证集合的同步性。也因此Vector的性能要比ArrayList低一些。
 */
import java.util.Arrays;
import java.util.List;

/*
 * 操作数组的工具类：Arrays，该工具类里的asList(Object...a)方法可以把一个数组或指定个数的对象转换成一个List集合。这个List集合是Arrays的内部类ArrayList的实例。
 * 固定长度的List：
 * 		Arrays.ArrayList是一个固定长度的List集合，程序只能遍历访问该集合里的元素，不可增加，删除。
 */
public class FixedSizeList {
	public static void main(String[] args) {
		List fixedList = Arrays.asList("小仙女","狗子");
//		获取fixedList的实现类，将输出Arrays$ArrayList
		System.out.println(fixedList.getClass());
//		使用方法引用遍历集合元素
		fixedList.forEach(System.out::println);
//		Arrays.ArrayList是一个固定长度的List集合，程序只能遍历访问该集合里的元素，不可增加，删除，否则会引发java.lang.UnsupportedOperationException
//		fixedList.add("疯狂Andriod讲义");
//		fixedList.remove("疯狂java讲义");
	}
}
