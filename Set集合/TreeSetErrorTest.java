package Set����;

/*
 * TreeSet���ϻ���ü���Ԫ�ص�compareTo(Object obj)�������Ƚ�Ԫ��֮��Ĵ�С��ϵ��Ȼ�󽫼���Ԫ�ذ����������У����ַ�ʽ������������
 * 
 * TreeSetҪ����Ȼ����ļ���Ԫ�ر���ʵ��Comparable�ӿڡ�����ͻ��׳�java.lang.ClassCastException�쳣��
 */
import java.util.TreeSet;

class Err{}

public class TreeSetErrorTest {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Err());
	}
}
