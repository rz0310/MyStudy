package Thread;

public class RunnableDemo implements Runnable {
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
	}
	@Override
	public void run() {
		
	}
	
}
