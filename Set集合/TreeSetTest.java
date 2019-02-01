package Set集合;
/*
 * HashSet采用hash算法来决定元素的存储位置不同，TreeSet采用红黑树的数据结构来存储集合元素。
 * TreeSet支持两种排序方式：自然排序和定制排序。默认使用自然排序。
 */
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet nums = new TreeSet();
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
//		输出集合元素，TreeSet集合元素按照元素实际值的大小来排序
		System.out.println(nums);
		System.out.println(nums.first());
		System.out.println(nums.last());
//		返回小于4的子集，不包含4
		System.out.println(nums.headSet(4));
//		返回大于5的子集，如果Set中还包含5，子集中也包含5
		System.out.println(nums.tailSet(5));
//		返回大于等于-3、小于4的子集 
		System.out.println(nums.subSet(-3, 4));
	}
}
