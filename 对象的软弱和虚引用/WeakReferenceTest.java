package 对象的软弱和虚引用;

import java.lang.ref.WeakReference;

/*
 * 弱引用测试
 */

/*
 * 1.强引用
 * 最常见的引用方式。程序创建一个对象，并把这个对象赋给一个引用变量，程序通过该引用变量来操作实际的对象，例如对象和数据。
 * 当一个对象被一个或者一个以上的引用变量所引用时，他处于可达状态，不可能被垃圾回收机制回收。
 * 2.软引用
 * 通过SoftReference类来实现，当一个对象只有一个软引用时，他有可能被垃圾回收机制回收。
 * 对于只有软引用的对象而言，当系统内存空间足够时，他不会被系统回收，程序也可使用该对象；当系统内存空间不足时，有可能被回收。
 * 软引用通常用于对内存敏感的程序。
 * 3.弱引用
 * 通过WeakReference来实现，弱引用与软银用很像，但弱引用的引用级别更低。对于只有弱引用的对象而言，当系统运行垃圾回收机制时，
 * 不管系统内存是否足够，总会回收该对象所占用的内存。注意：并不是说当一个只有弱引用时，他就会被立即回收——和那些失去引用的对象一样，
 * 必须等到垃圾回收机制运行时才会被回收。
 * 4.虚引用
 * 通过PhantomReference类来实现虚引用类似于没有引用。对对象本身没有太大影响，对象甚至感觉不到虚引用的存在。
 * 如果一个对象只有一个虚引用时，和没有引用的效果大致相同。
 * 虚引用主要用于跟踪对象被垃圾回收的状态，不能单独使用，虚引用必须和引用队列（ReferenceQuene）联合使用。
 */
public class WeakReferenceTest {
	public static void main(String[] args) throws Exception {
//		创建一个字符串对象
		String str = new String("弱引用测试");
//		创建一个弱引用，让此弱引用引用到字符串"弱引用测试"
		WeakReference wr = new WeakReference(str);
//		切断str引用与字符串之间的引用
		str = null;
//		取出弱引用所引用的对象
		System.out.println(wr.get());
//		强制垃圾回收
		System.gc();
		System.runFinalization();
//		再次取出弱引用所引用的对象
		System.out.println(wr.get());
		
/*
 * 由于垃圾回收机制的不确定性，当程序希望从软、弱和虚引用中取出被引用对象时，可能这个被引用对象已经被释放了。如果需要使用那个被引用的对象，
 * 则必须重新创建该对象。有以下两种方式：
 */
//		1.
//		取出弱引用所引用的对象
//		Object obj = wr.get();
//		如果取出的对象为null
//		if(obj ==null) {
//		重新创建一个新的对象，再次让弱引用引用该对象
//			wr = new WeakReference(recreateIt());
//		取出弱引用所引用的对象，将其赋给obj变量
//		因为垃圾回收机制的不确定性，如果在此处进行垃圾回收，系统再次将wr所引用的对象回收，从而导致obj依然为null
//			obj = wr.get();
//		}
//		操作obj对象
//		再次切断obj与对象之间的关联
//		obj = null;
//		2.
//		取出弱引用所引用的对象
//		如果取出的对象为null
//		if(obj ==null) {
//		重新创建一个新的对象，并使用强引用来引用他
//			obj = recreateIt();
//			取出弱引用所引用的对象，将其赋给obj变量
//			wr = new WeakReference(obj);
//		}
//		操作obj对象
//		再次切断obj与对象之间的关联
//		obj = null;
	}
}
