package Collection��Iterator�ӿ�;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {
	public static void main(String[] args) {
//		��������
		Collection books = new HashSet();
//		���������Ԫ��
		books.add(new String("������JavaEE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���ios����"));
		books.add(new String("���Ajax����"));
		books.add(new String("���Andriod����"));
//		ͳ����������"���"�Ӵ���ͼ������
		System.out.println(calAll(books,a->((String)a).contains("���")));
//		ͳ����������"Java"�Ӵ���ͼ������
		System.out.println(calAll(books,ele->((String)ele).contains("Java")));
//		ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(calAll(books,ele->((String)ele).length()>10));
	}
	public static int calAll(Collection books,Predicate p) {
		int total = 0;
		for(Object obj : books) {
//			ʹ��predicate��test()�����жϸö����Ƿ�����Predicateָ��������
			if(p.test(obj)) {
				total++;
			}
		}
		return total;
	}
}
