package Map集合;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("二狗子", 109);
		map.put("小仙女", 99);
		map.put("杨二傻", 79);
		System.out.println(map);
//		尝试替换key为"巴巴"的value，由于原map中没有对应的key，因此map没有改变，不会添加key-value对
		map.replace("巴巴", 66);
		System.out.println(map);
//		使用原value传入参数计算的结果覆盖原有的value
		map.merge("杨二傻", 10, (oldVal,param)->(Integer)oldVal+(Integer)param);
		System.out.println(map); //"杨二傻"所对应的value增大了10
//		当key为"Java"对应的value为null（或不存在）时，使用计算的结果作为新value
		map.computeIfAbsent("Java", (key)->((String)key).length());
//		增加了一个新的key-value对，Java=4
		System.out.println(map);
//		当key为"Java"对应的value存在时，使用计算的结果作为新value
		map.computeIfPresent("Java", (key,value)->(Integer)value*(Integer)value);
//		key为"Java"的value从4变为16
		System.out.println(map);
	}
}
