package Map����;
/*
 * Map���ڱ������ӳ���ϵ�����ݣ���������ֵ���ֱ���key��value��Map��ʱҲ����Ϊ�ֵ���߹������顣
 * Map�ṩ��һ��Entry�ڲ�������װkey-value�ԣ�������Entry�洢ʱ��ֻ����Entry��װ��key��
 * Java��ʵ����Map��Ȼ��ͨ����װһ������value��Ϊnull��Map��ʵ����Set���ϡ�
 * 
 * Map�ṩ��һ��Entry�ڲ�������װKey-value�ԣ�������Entry�洢ʱ��ֻ����Entry��װ��key��
 */
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
//		�ɶԷ�����key-value��
		map.put("������", 100);
		map.put("С��Ů", 999);
		map.put("���ɵ", 666);
//		��η����key-value���е�value�����ظ�
		map.put("����", 200);
		System.out.println(map);
//		�����ظ���valueʱ���µ�value�Ḳ��ԭ�е�value
//		����µ�value������ԭ�е�value���÷������ر����ǵ�value
		System.out.println(map.put("����", 500));
		System.out.println(map);
//		�ж��Ƿ����ָ��key
		System.out.println("�Ƿ����ֵΪ'������'��key:"+map.containsKey("������"));
//		�ж��Ƿ����ָ��value
		System.out.println("�Ƿ����ֵΪ'999'��value:"+map.containsValue(999));
//		keySet()�������ڻ�ȡMap����������key��ɵļ��ϣ�ͨ������key��ʵ�ֱ������е�key-value��
		for(Object key : map.keySet()) {
//			ͨ��map.get(key)������ȡkey��Ӧ��value
			System.out.println(key+"->"+map.get(key));
		}
//		����key��ɾ��key-value�ԣ����ر�ɾ��key����Ӧ��value�������key�����ڣ�����null
		System.out.println(map.remove("����"));
//		�������в��ٰ���"����->500"��
		System.out.println(map);
//		����key��ɾ��key-value�ԣ����ر�ɾ��key����Ӧ��value�������key�����ڣ�����null
		System.out.println(map.remove("����"));//���null
	}
}
