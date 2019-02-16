package List����;
/*
 * Java8ΪList�ṩ������Ĭ�ϵķ�����sort()��replaceAll()������sort()������Ҫһ��Comparator����������Ԫ������
 * ����Lambda���ʽ����Ϊ��������replaceAll()����Ҫһ��UnaryOperator���滻����Ԫ�ؼ��ϣ���Ҳ��һ������ʽ�ӿڣ�
 * Ҳ����Lambda���ʽ��Ϊ������
 */
import java.util.ArrayList;
import java.util.List;

public class ListTest3 {
	public static void main(String[] args) {
		List books = new ArrayList();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���java����"));
		books.add(new String("���Andriod����"));
		books.add("���IOS����");
		System.out.println(books);
//		ʹ��Ŀ������ΪComparator��Lambda���ʽ��List��������
		books.sort((o1,o2)->((String)o1).length()-((String)o2).length());
		System.out.println(books);
		books.replaceAll(ele->((String)ele).length());
		System.out.println(books);
	}
}
