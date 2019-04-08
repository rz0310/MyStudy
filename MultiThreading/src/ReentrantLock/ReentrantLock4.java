package ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*
reentrantLock用于代替synchronized。
本例中由于m1锁定this，只有m1执行完毕的时候，m2才能执行
复习synchronized最原始的定义。

使用ReentrantLock可以完成同样的功能
需要注意的是，必须要手动释放锁*****
使用synchronized的话如果碰到异常，jvm会自动释放锁，但是lock必须手动释放锁，因此
经常在finally中进行锁的释放。

使用reentrantLock可以进行"尝试锁定"trylock，如果无法锁定或在指定时间内无法锁定，线程可以决定是否继续等待。
在一个线程等待锁的过程中，可以被打断。
*/
public class ReentrantLock4 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Thread t1 = new Thread(()->{
            try {
                lock.lock();
                System.out.println("t1 start");
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                System.out.println("t1 end");
            } catch (InterruptedException e) {
                System.out.println(" t1 interrupted!");
            }finally {
                lock.unlock();
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            try {
//              lock.lock();
                lock.lockInterruptibly();//可以对interrupt()方法作出响应
                System.out.println("t2 start");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("t2 end");
            } catch (InterruptedException e) {
                System.out.println("t2 interrupted!");
            }finally {
                boolean b = lock.tryLock();
                if(b)lock.unlock();
            }
        });
        t2.start();
        t2.interrupt();//因为使用的是lockInterruptibly，所以主线程（其他线程）可以打断线程t2
    }
}
