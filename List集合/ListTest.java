package List����;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϴ���һ��
 */
public class ListTest {
	public static void main(String[] args) {
		List books = new ArrayList();
//		��books�������������Ԫ��
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���java����"));
		books.add(new String("���Andriod����"));
		System.out.println(books);
//		�����ַ���������뵽�ڶ���λ��
		books.add(1, new String("���Ajax����"));
		System.out.println(books);
		for(int i=0;i<books.size();i++) {
			System.out.println(books.get(i));
		}
//		ɾ��������Ԫ��
		books.remove(2);
		System.out.println(books);
//		�ж�ָ��Ԫ���ڼ����е�λ�ã����1������λ�ڵڶ�λ
		System.out.println(books.indexOf(new String("���Ajax����")));
//		���ڶ���Ԫ���滻���µ��ַ�������
		books.set(1, new String("���java����"));
		System.out.println(books);
//		��books���ϵĵڶ���Ԫ�أ�����������������Ԫ�أ�����������ȡ���Ӽ���
		System.out.println(books.subList(1, 2));
	}
}
