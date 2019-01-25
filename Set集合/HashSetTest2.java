package Set����;
/*
 * ������ѿɱ������ӵ�HashSet��֮�󣬾�����Ҫȥ�޸ĸü���Ԫ���в��������HashCode()��equals()��ʵ��������
 * ����ᵼ��HashSet�޷���ȷ������ЩԪ�ء�
 */
import java.util.HashSet;
import java.util.Iterator;

class R {
	int count;
	public R(int count) {
		this.count = count;
	}
//	��дtoString()����
	public String toString() {
		return "R[count:"+count+"]";
	}
//	��дequals()����
	public boolean equals(Object obj) {
		if(this ==obj) {
			return true;
		}
		if(obj != null && obj.getClass() == R.class) {
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
//	��дhashCode()����
	public int hashCode() {
		return this.count;
	}
}

public class HashSetTest2 {
	public static void main(String[] args) {
//		����һ��HashSet����
		HashSet hs = new HashSet();
//		��HashSet��������ӵ�Ԫ��Ԫ���У�������һ����new�����ģ�����ͻ��׳�ClassCastException
		hs.add(5);
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
//		��ӡHashSet���ϣ�����Ԫ��û���ظ�
		System.out.println(hs);
//		ȡ����һ��Ԫ��
		Iterator it = hs.iterator();
		R firstR = (R) it.next();
//		ΪR����ĵ�һ��Ԫ�ص�countʵ��������ֵ
		firstR.count = -3;
//		�ٴ��������Ԫ�أ����ظ�
		System.out.println(hs);
//		ɾ��countΪ-3��R����
		hs.remove(new R(-3));
		System.out.println(hs);
		System.out.println(hs.contains(new R(-3)));//���false
		System.out.println(hs.contains(new R(-2)));//���false
	}
}
