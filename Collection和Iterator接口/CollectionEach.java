package Collection��Iterator�ӿ�;
/*
 * ʹ��Lambda���ʽ��������
 */
import java.util.Collection;
import java.util.HashSet;
/*
 * ���³����е����һ�д��������Iterable��foreach()��������������Ԫ�أ������÷�������һ��Lambda���ʽ��
 * �ñ��ʽ��Ŀ��������Comsumer��foreach()�������Զ�������Ԫ������ش���Lambda���ʽ���βΡ�
 */
public class CollectionEach {
	public static void main(String[] args) {
//		����һ������
		Collection books = new HashSet();
		books.add("���java����");
		books.add("������JavaEE��ҵӦ��ʵս");
		books.add("���Android����");
//		����foreach������������
		books.forEach(obj->System.out.println("��������Ԫ�أ�"+obj));
	}
}
