package Map����;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("������", 109);
		map.put("С��Ů", 99);
		map.put("���ɵ", 79);
		System.out.println(map);
//		�����滻keyΪ"�Ͱ�"��value������ԭmap��û�ж�Ӧ��key�����mapû�иı䣬�������key-value��
		map.replace("�Ͱ�", 66);
		System.out.println(map);
//		ʹ��ԭvalue�����������Ľ������ԭ�е�value
		map.merge("���ɵ", 10, (oldVal,param)->(Integer)oldVal+(Integer)param);
		System.out.println(map); //"���ɵ"����Ӧ��value������10
//		��keyΪ"Java"��Ӧ��valueΪnull���򲻴��ڣ�ʱ��ʹ�ü���Ľ����Ϊ��value
		map.computeIfAbsent("Java", (key)->((String)key).length());
//		������һ���µ�key-value�ԣ�Java=4
		System.out.println(map);
//		��keyΪ"Java"��Ӧ��value����ʱ��ʹ�ü���Ľ����Ϊ��value
		map.computeIfPresent("Java", (key,value)->(Integer)value*(Integer)value);
//		keyΪ"Java"��value��4��Ϊ16
		System.out.println(map);
	}
}
