package Collection��Iterator�ӿ�;

/*
 * Iterator���������õ��ǿ���ʧ�ܣ�fail-fast�����ƣ�һ���ڵ��������м�⵽�ü����Ѿ����޸ģ�ͨ���ǳ����е������߳��޸ģ���
 * ����ͻ�����java.util.ConcurrentModificationException�쳣����������ʾ�޸ĺ�Ľ�����������Ա��⹲����Դ��������Ǳ�����⡣
 */

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest {
	public static void main(String[] args) {
//		����һ������
		Collection books = new HashSet();
		books.add("���java����");
		books.add("������JavaEE��ҵӦ��ʵս");
		books.add("���Android����");
//		��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
		while(it.hasNext()) {
//			it.next()�������ص�����������Object���ͣ������Ҫǿ������ת��
			String book = (String) it.next();
			System.out.println(book);
			if(book.equals("���java����")) {
//				ʹ��Iterator�������Ĺ����У������޸ļ���Ԫ�أ�������������쳣
				books.remove(book);
			}
		}
	}
}
