package Set����;
/*
 * ������LinkedHashSet�������Ԫ��ʱ��LinkedHashSet���ᰴԪ�ص����˳�������ʼ������Ԫ�ء�
 * ��ΪLinkedHashSet��Ҫά��Ԫ�صĲ���˳����������Ե���HashSet�����ܡ����ڵ�������Set���ȫ��Ԫ�ؽ��кܺõ����ܣ�
 * ��Ϊ����������ά���ڲ�˳��
 */
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet books = new LinkedHashSet();
		books.add("���java����");
		books.add("������");
		System.out.println(books);
		books.remove("���java����");
		books.add("���java����");
		System.out.println(books);
	}
}
