package Set����;
/*
 * ע�⣺������һ��Collection�������Ԫ��������EnumSet����ʱ�����뱣֤Collection�����������Ԫ�ض���ͬһ��ö�����ö��ֵ��
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest2 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		System.out.println(c);
		c.clear();
		System.out.println(c);
		c.add(Season.FALL);
		c.add(Season.WINTER);
//		����c�������������Ԫ��������EnumSet����
		EnumSet enumset = EnumSet.copyOf(c);
		System.out.println(enumset);
		c.add("���java����");
//		������뷢���쳣 java.lang.ClassCastException�����c���������Ԫ�ز�ȫ��ö���ࡣ
//		enumset.copyOf(c);
	}
}
