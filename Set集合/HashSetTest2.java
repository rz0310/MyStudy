package Set集合;
/*
 * 当程序把可变对象添加到HashSet中之后，尽量不要去修改该集合元素中参与运算的HashCode()、equals()的实例变量，
 * 否则会导致HashSet无法正确操作这些元素。
 */
import java.util.HashSet;
import java.util.Iterator;

class R {
	int count;
	public R(int count) {
		this.count = count;
	}
//	重写toString()方法
	public String toString() {
		return "R[count:"+count+"]";
	}
//	重写equals()方法
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
//	重写hashCode()方法
	public int hashCode() {
		return this.count;
	}
}

public class HashSetTest2 {
	public static void main(String[] args) {
//		创建一个HashSet集合
		HashSet hs = new HashSet();
//		给HashSet集合中添加的元素元素中，必须有一个是new出来的，否则就会抛出ClassCastException
		hs.add(5);
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
//		打印HashSet集合，集合元素没有重复
		System.out.println(hs);
//		取出第一个元素
		Iterator it = hs.iterator();
		R firstR = (R) it.next();
//		为R对象的第一个元素的count实例变量赋值
		firstR.count = -3;
//		再次输出集合元素，有重复
		System.out.println(hs);
//		删除count为-3的R对象
		hs.remove(new R(-3));
		System.out.println(hs);
		System.out.println(hs.contains(new R(-3)));//输出false
		System.out.println(hs.contains(new R(-2)));//输出false
	}
}
