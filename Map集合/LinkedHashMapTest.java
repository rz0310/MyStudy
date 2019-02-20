package Map集合;
/*
 * LinkedHashMap也使用双向链表来维护key-value对的次序(其实只要考虑key的次序)，
 * 该链表负责维护Map的迭代顺序，迭代顺序与key-value对的插入顺序一致。
 * 
 * LinkedHashMap需要维护插入顺序，因此性能略低于HashMap；但是它以链表来维护内部顺序，在迭代访问Map的全部元素时性能较好。
 */
import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("语文", 99);
		lhm.put("数学", 89);
		lhm.put("英语", 79);
		lhm.forEach((key,value)->System.out.println(key+"->"+value));
	}
}
