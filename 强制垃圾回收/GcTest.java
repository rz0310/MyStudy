package 强制垃圾回收;
/*
 * 强制垃圾回收的两种方式：
 * （1）调用System类的gc()静态方法：System.gc();
 * （2）调用Runtime()对象的gc()实例方法：Runtime.getRuntime().gc();
 */
public class GcTest {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			new GcTest();
//			下面两行代码的作用完全相同，强制系统进行垃圾回收
//			System.gc();
			Runtime.getRuntime().gc();
		}
	}
	public void finalize() {
		System.out.println("系统正在清理GcTest的资源");
	}
}
