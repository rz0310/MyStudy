package Synchronized;

public class Test5 {
    private int count = 10;
    public synchronized void run(){
        count--;
        System.out.println(Thread.currentThread().getName()+" count="+count);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Test4 test4 = new Test4();//每次启动一个线程，给他创建一个对象
            new Thread(test4, "Thread" + i).start();
        }
    }
}
