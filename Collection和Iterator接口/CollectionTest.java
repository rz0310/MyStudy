package Collection��Iterator�ӿ�;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
//		���Ԫ��
		c.add("�����");
//		��Ȼ�����ﲻ�ܷŻ������͵�ֵ������java֧���Զ�װ��
		c.add(6);
		System.out.println("c����Ԫ�صĸ���Ϊ��"+c.size());//���2
//		ɾ��ָ��Ԫ��
		c.remove(6);
		System.out.println("c����Ԫ�صĸ���Ϊ��"+c.size());//���1��
//		�ж��Ƿ����ָ���ַ���
		System.out.println(c.contains("�����"));
		c.add("��˽�");
		System.out.println("c���ϵ�Ԫ�أ�"+c);
		Collection books = new HashSet();
		books.add("��˽�");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�"+c.containsAll(books));//���false
//		�ü���c��ȥbooks���������Ԫ��
		c.removeAll(books);
		System.out.println("c�������Ԫ�أ�"+c);
//		ɾ��c�������������Ԫ��
		c.clear();
		System.out.println("c�������Ԫ�أ�"+c);
//		����books��������ֻʣ��c������Ҳ������Ԫ��
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ�أ�"+books);
	}
}
