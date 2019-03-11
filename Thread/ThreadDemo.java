package Thread;

public class ThreadDemo extends Thread{
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
//		��ȡ��ǰ�̵߳�����
		System.out.println(Thread.currentThread().getName());
//		���õ�ǰ�̵߳�����
		Thread.currentThread().setName("mian");
		System.out.println(Thread.currentThread().getName());
//		��ȡ�̵߳����ȼ�
		System.out.println(t1.getPriority());
//		�����̵߳����ȼ�
		t1.setPriority(6);
		System.out.println(t1.getPriority());
//		�����߳�
		t2.start();
		t1.start();
//		��ȡ�̵߳�״̬
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
