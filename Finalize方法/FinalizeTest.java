package Finalize方法;
/*
 * 由于finalize方法不一定会被执行，如果想清理某个类里打开的资源，不要放在finalize()方法中进行清理。
 * 
 * finalize()方法的4个特点：
 * (1)永远不要主动调用某个对象的finalize方法，该方法应该交给垃圾回收机制进行调用。
 * (2)finalize()方法何时被调用，是否被调用具有不确定性。
 * (3)当JVM执行可恢复对象的finalize()方法时，可能使该对象或系统中的其他对象重新变成可达状态。
 * (4)当JVM执行finalize()方法出现异常时，垃圾回收机制不会报告异常，程序继续执行。
 */
public class FinalizeTest {
	private static FinalizeTest ft = null;
	public void info() {
		System.out.println("测试资源清理的finalize()方法");
	}
	public static void main(String[] args) throws Exception {
//		创建finalizeTest对象立即进入可恢复状态(创建后没有把这个对象赋给任何引用变量，所以该对象立即进入可恢复状态)
		new FinalizeTest();
		
//		通知系统进行资源回收
		System.gc();
		
//		强制垃圾回收机制调用可恢复对象的finalize()方法
//		Runtime.getRuntime().runFinalization();
//		System.runFinalization();
		
		ft.info();
	}
	public void finalize() {
//		让ft引用到试图回收的可恢复对象，即可恢复对象重新变成可达
		ft = this;
	}
}
