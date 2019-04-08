package BetterSynchronized;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/*
synchronized优化：同步代码块中的语句越少越好
 */
public class Test1 implements Runnable{
    int count = 0;
    synchronized void m1(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;//业务逻辑只有下面这句是syn，这时不应该给整个方法上锁
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    void m2(){
//        do sth need not sync
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        业务逻辑只有下面这句话需要sync，这时不应该给整个方法上锁
//        采用细粒度的锁，可以使线程争用时间变短从而提高效率
        synchronized (this){
            count++;
        }
//        do sth need not sync
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("start");
    }

    @Test
    public void test() {
        new Test1().m1();
//        new Test1().m2();
    }
}
