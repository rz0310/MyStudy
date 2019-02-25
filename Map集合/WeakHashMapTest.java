package Map集合;
/*
 * HashMap的key保留了对实际对象的强引用，而WeakHashMap只保留了对实际对象的弱引用，即如果WeakHashMap的对象key所引用的对象没有被其他强引用变量所引用，
 * 这些key可能被垃圾回收，WeakHashMap也自动删除这些key所对应的key-value对。
 */
import java.util.WeakHashMap;

public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
//		前三个都是匿名的字符串，WeakHashMap只保留了对它们的弱引用
		whm.put(new String("语文"), new String("良好"));
		whm.put(new String("数学"), new String("中等"));
		whm.put(new String("英语"), new String("及格"));
		System.out.println(whm);
//		字符串直接量，系统会保存对该字符串对象的强引用
		whm.put("Java", new String("中等"));
		System.out.println(whm);
//		通知系统进行垃圾回收
		System.gc();
		System.runFinalization();
//		通常情况下，只剩下一个key-value对
		System.out.println(whm);
	}
}
