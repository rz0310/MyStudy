package List����;
/*
 * ��Ҫɾ��List�����е�һ������ʱ��List������ø�A�����equals()���������뼯��Ԫ�رȽϣ��������true��List����ɾ����Ԫ�ء�
 * 
 * ע�⣺������List��set(int index,Object element)�������ı�List����ָ����������Ԫ��ʱ��
 * ָ��������������List���ϵ���Ч���������÷�������ı�List���ϵĳ��ȡ�
 */
import java.util.ArrayList;
import java.util.List;

class A {
	public boolean equals(Object obj) {
		return true;
	}
}

public class ListTest2 {
	public static void main(String[] args) {
		List books = new ArrayList();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���java����"));
		books.add(new String("���Andriod����"));
		System.out.println(books);
//		ÿ��ɾ��list�����е�A����ʱ������ɾ��List�����еĵ�һ��Ԫ��
//		ɾ�������е�A����,�����¼����еĵ�һ��Ԫ�ر�ɾ��
		books.remove(new A());
		System.out.println(books);
//		ɾ�������е�A�����ٴ�ɾ�������еĵ�һ��Ԫ��
		books.remove(new A());
		System.out.println(books);
	}
}
