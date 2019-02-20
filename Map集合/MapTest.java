package Map集合;
/*
 * Map用于保存具有映射关系的数据，保存两组值，分别是key和value。Map有时也被称为字典或者关联数组。
 * Map提供了一个Entry内部类来封装key-value对，而计算Entry存储时则只考虑Entry封装的key。
 * Java先实现了Map，然后通过包装一个所有value都为null的Map就实现了Set集合。
 * 
 * Map提供了一个Entry内部类来封装Key-value对，而计算Entry存储时则只考虑Entry封装的key。
 */
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
//		成对放入多个key-value对
		map.put("二狗子", 100);
		map.put("小仙女", 999);
		map.put("杨二傻", 666);
//		多次放入的key-value对中的value可以重复
		map.put("花花", 200);
		System.out.println(map);
//		放入重复的value时，新的value会覆盖原有的value
//		如果新的value覆盖了原有的value，该方法返回被覆盖的value
		System.out.println(map.put("花花", 500));
		System.out.println(map);
//		判断是否包含指定key
		System.out.println("是否包含值为'二狗子'的key:"+map.containsKey("二狗子"));
//		判断是否包含指定value
		System.out.println("是否包含值为'999'的value:"+map.containsValue(999));
//		keySet()方法用于获取Map集合中所有key组成的集合，通过遍历key来实现遍历所有的key-value对
		for(Object key : map.keySet()) {
//			通过map.get(key)方法获取key对应的value
			System.out.println(key+"->"+map.get(key));
		}
//		根据key来删除key-value对，返回被删除key所对应的value，如果该key不存在，返回null
		System.out.println(map.remove("花花"));
//		输出结果中不再包含"花花->500"对
		System.out.println(map);
//		根据key来删除key-value对，返回被删除key所对应的value，如果该key不存在，返回null
		System.out.println(map.remove("花花"));//输出null
	}
}
