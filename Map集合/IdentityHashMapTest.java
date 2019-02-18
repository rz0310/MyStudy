package Map集合;
/*
 * 在IdentityHashMap中，当且仅当两个key严格相等（key1==key2）时，IdentityHashMap才认为两个key相等。
 */
import java.util.IdentityHashMap;

public class IdentityHashMapTest {
	public static void main(String[] args) {
		IdentityHashMap ihm = new IdentityHashMap();
//		下面代码将会向IdentityHashMap中添加两个key-value对
//		这两个key-value对中的key是新创建的字符串对象，通过==比较不相等
		ihm.put(new String("语文"), 89);
		ihm.put(new String("语文"),78);
//		下面代码将会向IdentityHashMap中添加一个key-value对
//		这两个key-value对中的key都是字符串常量，而且他们的字符串序列完全相同，Java通过常量池来管理字符串直接量，所以他们通过==比较相等
		ihm.put("Java",93);
		ihm.put("Java",98);
		System.out.println(ihm);
	}
}
