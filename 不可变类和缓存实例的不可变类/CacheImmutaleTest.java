package 不可变类和缓存实例的不可变类;

public class CacheImmutaleTest {
	public static void main(String[] args) {
		CacheImmutale c1 = CacheImmutale.valueof("hello");
		CacheImmutale c2 = CacheImmutale.valueof("hello");
//		下面代码输出true
		System.out.println(c1 == c2);
	}
}
