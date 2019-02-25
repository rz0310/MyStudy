package Map����;

import java.util.Iterator;
import java.util.TreeMap;

/*
 * TreeMap��һ����������ݽṹ��ÿ��key-value�Լ���Ϊ�������һ���ڵ㡣
 * TreeMap�洢key-value��ʱ����Ҫ����key�Խڵ�������򡣱�֤����key-value�Դ�������״̬��
 * ��������ʽ��
 * 	��Ȼ����TreeMap������key����ʵ��comparable�ӿڣ��������е�keyӦ����ͬһ����Ķ��󣬷�����׳�ClassCastException��
 * 	�������򣺴���TreeMap����ʱ����Ҫ����һ��comparator�����ɸö���������е�ekey���򡣶�������Ҫ��ʵ��comparable�ӿڡ�
 * 
 * TreeSet���ж�����Ԫ����ȵı�׼������keyͨ��compareTo()��������0��
 * ���ʹ���Զ�������ΪTreeMap��key��������TreeMap���õĹ���������д�����equals()������compareTo()����ʱӦ����һ�µķ��ؽ����
 * ������keyͨ��equals()��������true��compareTo()��������0��
 */
class R implements Comparable{
	int count;
	public R(int count) {
		this.count = count;
	}
	public String toString() {
		return "R[count:"+count+"]";
	}
//	����count���ж����������Ƿ����
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj != null && obj.getClass() == R.class) {
			R r = (R)obj;
			return r.count == this.count;
		}
		return false;
	}
//	����count����ֵ���ж���������Ĵ�С
	public int compareTo(Object obj) {
		R r = (R)obj;
		return count > r.count ? 1 : count < r.count ? -1 : 0;
	}
}

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "a");
		tm.put(new R(-5), "b");
		tm.put(new R(9), "c");
		System.out.println(tm);
//		���ظ�TreeMap�ĵ�һ��Entry����
		System.out.println(tm.firstEntry());
//		���ظ�TreeMap�����һ��keyֵ
		System.out.println(tm.lastKey());
//		���ظ�TreeMap�ı�new R(2)�����Сkeyֵ
		System.out.println(tm.higherKey(new R(2)));
//		���ظ�TreeMap�ı�new R(2)С������key-value��	
		System.out.println(tm.lowerEntry(new R(2)));
//		���ظ�TreeMap����TreeMap
		System.out.println(tm.subMap(new R(-1), new R(4)));
	}
}
