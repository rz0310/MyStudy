package ���ɱ���ͻ���ʵ���Ĳ��ɱ���;

public class CacheImmutaleTest {
	public static void main(String[] args) {
		CacheImmutale c1 = CacheImmutale.valueof("hello");
		CacheImmutale c2 = CacheImmutale.valueof("hello");
//		����������true
		System.out.println(c1 == c2);
	}
}
