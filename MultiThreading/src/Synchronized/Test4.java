package Synchronized;

public class Test4 implements Runnable{
    private int count = 10;
    public /*synchronized*/ void run(){
        count--;
        System.out.println(Thread.currentThread().getName()+" count="+count);
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        for (int i = 0; i < 5; i++) {
            new Thread(test4, "Thread" + i).start();
        }
    }
}
