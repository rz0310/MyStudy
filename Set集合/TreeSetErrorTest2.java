package Set����;
/*
 * ���ϣ��TreeSet������������ֻ�����ͬһ�����͵Ķ���
 * 
 * ����һ���������TreeSet�����У�TreeSet���øü��ϵ�compareTo()�����������е���������Ƚϴ�С��Ȼ����ݺ�����ṹ�ҵ����Ĵ洢λ�á�
 * �����������ͨ��compareTo(Object obj)�����Ƚ���ȣ��¶����޷���ӵ�TreeSet�����С�
 */
import java.util.Date;
import java.util.TreeSet;

public class TreeSetErrorTest2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("���java����");
		System.out.println(ts);
		
//		ע�⣺��TreeSet��������ӵ�Ӧ����ͬһ����Ķ��󣬷���Ҳ������java.lang.ClassCastException�쳣
//		ts.add(new Date());
		
//		ע�⣺�����������ͨ��compareTo(Object obj)�����Ƚ���ȣ��¶����޷���ӵ�TreeSet�����С�
//		ts.add("���java����");
//		System.out.println(ts);
//		ts.add(new String("���java����"));
//		System.out.println(ts);
		
	}
}
