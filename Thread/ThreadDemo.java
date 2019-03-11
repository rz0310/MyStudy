package Thread;

public class ThreadDemo extends Thread{
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
//		获取当前线程的名字
		System.out.println(Thread.currentThread().getName());
//		设置当前线程的名字
		Thread.currentThread().setName("mian");
		System.out.println(Thread.currentThread().getName());
//		获取线程的优先级
		System.out.println(t1.getPriority());
//		设置线程的优先级
		t1.setPriority(6);
		System.out.println(t1.getPriority());
//		运行线程
		t2.start();
		t1.start();
//		获取线程的状态
		System.out.println(t1.getState());
		
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				
				if(i==2) {
					this.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
