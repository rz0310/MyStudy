package Collection��Iterator�ӿ�;

import java.util.Collection;
import java.util.HashSet;

public class ColelctionStream {
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
		System.out.println(books.stream().filter(ele->((String)ele).contains("���")).count());//4
//		ͳ����������"Java"�Ӵ���ͼ������
		System.out.println(books.stream().filter(ele->((String)ele).contains("Java")).count());//2
//		ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(books.stream().filter(ele->((String)ele).length()>10).count());//2
//		�ȵ���Collection�����stream()����������ת��ΪStream
//		�ڵ���Stream��mapToInt()������ȡԭ�е�Stream��Ӧ��IntStream
		books.stream().mapToInt(ele->((String)ele).length()).forEach(System.out::println);
	}
}
