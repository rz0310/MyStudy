package Collection��Iterator�ӿ�;

import java.util.Collection;
import java.util.HashSet;

/*
 * ʹ��foreachѭ����������Ԫ��
 */
public class ForeachTest {
	public static void main(String[] args) {
//		����һ������
		Collection books = new HashSet();
		books.add("���java����");
		books.add("������JavaEE��ҵӦ��ʵս");
		books.add("���Android����");
		for(Object obj : books) {
//			�˴���book����Ҳ���Ǽ���Ԫ�ر���
			String book = (String) obj;
			System.out.println(book);
			if(book.equals("���java����")) {
//				������뽫������ConcurrentModificationException�쳣
//				books.remove(book);
			}
		}
		System.out.println(books);
	}
}
