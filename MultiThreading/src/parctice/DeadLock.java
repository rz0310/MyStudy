package parctice;

import java.util.concurrent.TimeUnit;

public class DeadLock implements Runnable{
    private Object o1 = "1";
    private  Object o2 = "2";
    @Override
    public void run() {
        System.out.println("start");
    }
    public void m1(){
        synchronized(o1) {
            System.out.println(Thread.currentThread().getName()+"1");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int i = Integer.valueOf("");
            m2();
        }
    }
    public void m2(){
        synchronized(o2) {
            System.out.println(Thread.currentThread().getName()+"2");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            m1();
        }
    }
}
