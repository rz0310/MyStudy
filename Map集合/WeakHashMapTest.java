package Map����;
/*
 * HashMap��key�����˶�ʵ�ʶ����ǿ���ã���WeakHashMapֻ�����˶�ʵ�ʶ���������ã������WeakHashMap�Ķ���key�����õĶ���û�б�����ǿ���ñ��������ã�
 * ��Щkey���ܱ��������գ�WeakHashMapҲ�Զ�ɾ����Щkey����Ӧ��key-value�ԡ�
 */
import java.util.WeakHashMap;

public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
//		ǰ���������������ַ�����WeakHashMapֻ�����˶����ǵ�������
		whm.put(new String("����"), new String("����"));
		whm.put(new String("��ѧ"), new String("�е�"));
		whm.put(new String("Ӣ��"), new String("����"));
		System.out.println(whm);
//		�ַ���ֱ������ϵͳ�ᱣ��Ը��ַ��������ǿ����
		whm.put("Java", new String("�е�"));
		System.out.println(whm);
//		֪ͨϵͳ������������
		System.gc();
		System.runFinalization();
//		ͨ������£�ֻʣ��һ��key-value��
		System.out.println(whm);
	}
}
