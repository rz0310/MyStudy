package Collection��Iterator�ӿ�;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {
	public static void main(String[] args) {
//		����һ������
		Collection books = new HashSet();
		books.add("���java����");
		books.add("������JavaEE��ҵӦ��ʵս");
		books.add("���Android����");
//		��ȡbooks���϶�Ӧ�ĵ�����
		Iterator it = books.iterator();
//		ʹ��Lambda���ʽ(Ŀ��������Comsumer)����������
//		��Lambda���ʽ��Ŀ��������Comsumer,����һ�д���Ҳ�����ڱ�������Ԫ��
		it.forEachRemaining(obj->System.out.println("��������Ԫ�أ�"+obj));
	}
}
