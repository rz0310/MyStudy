package Map����;
/*
 * ��ʹ���Զ�������ΪHashMap��Hashtable��keyʱ�������д�����equals(Object obj)������HashCode()��������Ӧ�ñ�֤
 * ������keyͨ��equals�����ȽϷ���trueʱ������key��HashCode()����ֵҲӦ����ȡ�
 */
import java.util.HashMap;
import java.util.Iterator;

class C {
	int count;
	public C(int count) {
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

class D {
//	��дequals�����������κζ�����B������ȶ�����true
	public boolean equals(Object obj) {
		return true;
	}
}
//????????????????????????????????????????????????/
public class HashMapErrorTest {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new C(60000), "С��Ů");
		hm.put(new C(999), "������");
		hm.put(new C(123), new D());
		System.out.println(hm);
//		��ȡhashMap��key set���϶�Ӧ�ĵ�����
//		Iterator it = hm.keySet().iterator();
//		C first = (C)it.next();
//		System.out.println(first.count);
//		first.count = 666;
//		System.out.println(first.count);
//		System.out.println(hm);
		hm.remove(new C(666));
		System.out.println(hm);
//		System.out.println(hm.get(new C(666)));
//		System.out.println(hm.get(new C(999)));
	}
}
