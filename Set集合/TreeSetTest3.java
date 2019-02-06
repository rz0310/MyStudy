package Set����;

import java.util.TreeSet;
/*
 * T����һ���ɱ��࣬��˿����޸�T�����countʵ��������ֵ
 */
class T implements Comparable {
	int count;
	public T(int count) {
		this.count = count;
	}
	public String toString() {
		return "T[count:"+count+"]";
	}
//	��дequals()����
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && obj.getClass() == T.class) {
			T t = (T)obj;
			return this.count == t.count;
		}
		return false;
	}
//	��дcompareTo()����������count���Ƚϴ�С
	public int compareTo(Object obj) {
		T t = (T)obj;
		return count > t.count ? 1 :
			count < t.count? -1 : 0;
	}
}

public class TreeSetTest3 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
//		ע��TreeSet���ϵ�add�������βα�����ͬһ����Ķ���new ����()��������ͻ��׳�ClassCastException�쳣
		ts.add(new T(5));
		ts.add(new T(-3));
		ts.add(new T(9));
		ts.add(new T(-2));
		System.out.println(ts);
//		ȡ����һ��Ԫ��
		T first = (T)ts.first();
//		�޸ĵ�һ��Ԫ�ص�count����
		first.count = 20;
//		ȡ�����һ��Ԫ��
		T last = (T)ts.last();
//		�޸����һ��Ԫ�ص�count����
		last.count = -2;
		System.out.println(ts);
//		ɾ��ʵ���������ı��Ԫ�أ�ɾ��ʧ��
		System.out.println(ts.remove(new T(-2)));
		System.out.println(ts);
//		ɾ��ʵ������û�б��ı��Ԫ�أ�ɾ���ɹ�
//		˵��TreeSet����ɾ��û�б��޸�ʵ���������Ҳ����������޸Ĺ�ʵ�������Ķ����ظ��Ķ���
		System.out.println(ts.remove(new T(5)));
//		��һ�д���ִ�����TreeSet��Լ����е�Ԫ�����������������������У����������Ϳ���ɾ��TreeSet�����е�����Ԫ���ˣ�
//		������Щ���޸Ĺ�ʵ��������Ԫ�ء�
		System.out.println(ts);
	}
}
