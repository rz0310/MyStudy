package Map����;
/*
 * ��IdentityHashMap�У����ҽ�������key�ϸ���ȣ�key1==key2��ʱ��IdentityHashMap����Ϊ����key��ȡ�
 */
import java.util.IdentityHashMap;

public class IdentityHashMapTest {
	public static void main(String[] args) {
		IdentityHashMap ihm = new IdentityHashMap();
//		������뽫����IdentityHashMap���������key-value��
//		������key-value���е�key���´������ַ�������ͨ��==�Ƚϲ����
		ihm.put(new String("����"), 89);
		ihm.put(new String("����"),78);
//		������뽫����IdentityHashMap�����һ��key-value��
//		������key-value���е�key�����ַ����������������ǵ��ַ���������ȫ��ͬ��Javaͨ���������������ַ���ֱ��������������ͨ��==�Ƚ����
		ihm.put("Java",93);
		ihm.put("Java",98);
		System.out.println(ihm);
	}
}
