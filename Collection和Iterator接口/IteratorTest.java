package Collection��Iterator�ӿ�;
/*
 * ʹ��java8��ǿ��Iterator��������Ԫ��
 * Iterator�����ڱ�������Ԫ�أ��䱾�����ṩ��װ�����������
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
//		����һ������
		Collection books = new HashSet();
		books.add("���java����");
		books.add("������JavaEE��ҵӦ��ʵս");
		books.add("���Android����");
		Iterator it = books.iterator();
		while(it.hasNext()) {
//			it.next()�������ص�����������Object���ͣ������Ҫǿ������ת��
			String book = (String) it.next();
			System.out.println(book);
			if(books.equals("���java����")) {
//				�Ӽ�����ɾ����һ��next���ص�Ԫ��
				it.remove();
			}
//			��book������ֵ������ı伯��Ԫ�ر���
			book = "�����ַ���";
		}
		System.out.println(books);
	}
}
