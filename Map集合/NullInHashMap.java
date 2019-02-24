package Map����;
/*
 * Hashtable������JDK1.0��
 * Java8�Ľ���HashMap��ʵ�֣�ʹ��HashMap����key��ͻʱ��Ȼ�нϺõ����ܡ�
 * 
 * HashMap��Hashtable�ĵ�������
 * Hashtable���̰߳�ȫ��Hashtable������˶���һЩ������ж���߳�ͬʱ����ͬһ��Map����ʱ��ʹ��Hashtableʵ�������á�
 * 					������null��Ϊkey��value�������ͼ���룬������NullPointerException��
 * HashMap���̲߳���ȫ��������ܸ�һЩ������null��Ϊkey��value������HashMap�е�key�����ظ������������һ��key-value�Ե�key����Ϊnull��
 * 					���ǿ������������key-value�Ե�value����Ϊnull��
 */
import java.util.HashMap;

public class NullInHashMap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
//		��ͼ������keyΪnullֵ��key-value�Է���HashMap
		hm.put(null, null);
		hm.put(null, null);
//		��ͼ��һ��valueΪnull��key-value�Է���HashMap
		hm.put("a", null);
		System.out.println(hm);
	}
}
