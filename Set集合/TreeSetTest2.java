package Set����;
/*
 * ����TreeSet���϶��ԣ��ж�����������ȵı�׼�ǣ���������ͨ��CompareTo(Object obj)�����Ƚ��Ƿ񷵻�0��������0��TreeSet��Ϊ������ȣ�
 * ������Ϊ���ǲ���ȡ�
 * 
 * ע�⣺����һ���������TreeSet�У����¸ö����Ӧ���equals()����ʱ��Ӧ��֤�÷�����compareTo(Object obj)������һ�µĽ����
 * ������ǣ������������ͨ��equals()�����Ƚϵķ���ֵΪtrueʱ������������ͨ��compareTo(Object obj)�����Ƚ�Ӧ�÷���0��
 */
import java.util.TreeSet;

class Z implements Comparable {
	int age;
	public Z(int age) {
		this.age = age;
	}
//	��дequals���������Ƿ���true
	public boolean equals(Object obj) {
		return true;
	}
//	��дcompareTo(Object obj)���������Ƿ���1(���ǲ����)
	public int compareTo(Object obj) {
		return 1;
	}
	
}

public class TreeSetTest2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		Z z1 = new Z(6);
		ts.add(z1);
		System.out.println(ts.add(z1));
		System.out.println(ts);
//		�޸�TreeSet���ϵĵ�һ��Ԫ�ص�age����
		((Z)ts.first()).age = 9;
//		���TreeSet�������һ��Ԫ�ص�age������Ҳ�����9
		System.out.println(((Z)ts.last()).age);
	}
}
