package Map����;
import java.util.HashMap;
/*
 * Ϊ�˳ɹ�����HashMap��Hashtable�д洢����ȡ��������key�Ķ������ʵ��HashCode()������equals()������
 * 
 * ������HashSet,HashMap��HashtableҲ���ܱ�֤����key-value��˳��
 * HashMap��Hashtable�ж�����key��ȵı�׼�ǣ�����keyͨ��equals()�ȽϷ���true������key��HashCode()Ҳ��ȡ�
 * ����value��ȵı�׼��ֻҪ��������ͨ��equals()�����ȽϷ���true���ɡ�
 */
import java.util.Hashtable;

class A {
	int count;
	public A(int count) {
		this.count = count;
	}
//	����count��ֵ���ж����������Ƿ����
	public boolean equals(Object obj) {
		if(obj == this) {
			return true;
		}
		if(obj != null && obj.getClass() == A.class) {
			A a = (A)obj;
			return this.count == a.count;
		}
		return false;
	}
//	����count������hashCodeֵ
	public int hashCode() {
		return this.count;
	}
}

class B {
//	��дequals�����������κζ�����B������ȶ�����true
	public boolean equals(Object obj) {
		return true;
	}
}

public class HashtableTest {
	public static void main(String[] args) {
		HashMap ht = new HashMap();
//		Hashtable ht = new Hashtable();
		ht.put(new A(60000), "С��Ů");
		ht.put(new A(999), "������");
		ht.put(new A(123), new B());
		System.out.println(ht);
//		ֻҪ��������ͨ��equals()�����ȽϷ���true,Hashtable����Ϊ��������ȵ�value
//		HashTbable����һ��B����equals()����ʼ�շ���true
//		System.out.println(ht.containsValue("�����ַ���"));
//		ֻҪ���������count���equals����true,��hashCode��ȡ�Hashtable����Ϊ��������ͬ��key
//		System.out.println(ht.containsKey(new A(999)));
//		ɾ�����һ��key-value��
		ht.remove(new A(123));
		System.out.println(ht);
	}
}
