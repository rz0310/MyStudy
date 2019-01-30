package Set集合;

/*
 * TreeSet集合会调用集合元素的compareTo(Object obj)方法来比较元素之间的大小关系，然后将集合元素按照升序排列，这种方式就是升序排序。
 * 
 * TreeSet要求自然排序的集合元素必须实现Comparable接口。否则就会抛出java.lang.ClassCastException异常。
 */
import java.util.TreeSet;

class Err{}

public class TreeSetErrorTest {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Err());
	}
}
