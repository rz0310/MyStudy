package Collection��Iterator�ӿ�;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {
	/*
	 * ��������д����ִ��������Collection����deremoveIf()��������ɾ�������з���������Ԫ�أ�
	 * ������һ��Lambda���ʽ��Ϊ�������������г���С��10���ַ���Ԫ�ض��ᱻɾ����
	 */
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add(new String("������JavaEE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���ios����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Andriod����"));
//		ʹ��Lambda���ʽ��Ŀ��������Predicate�����˼���
		books.removeIf(ele->((String)ele).length()<10);
		System.out.println(books);
	}
}
