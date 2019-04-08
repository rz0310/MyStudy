package ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/*
reentrantLock用于代替synchronized。
本例中由于m1锁定this，只有m1执行完毕的时候，m2才能执行
复习synchronized最原始的定义。

使用ReentrantLock可以完成同样的功能
需要注意的是，必须要手动释放锁*****
使用synchronized的话如果碰到异常，jvm会自动释放锁，但是lock必须手动释放锁，因此
经常在finally中进行锁的释放。

 */
public class ReentrantLock2 {
    ReentrantLock lock = new ReentrantLock();

    void m1() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    void m2(){
        lock.lock();
        System.out.println("m2...");
        lock.unlock();
    }

    public static void main(String[] args) {
        ReentrantLock2 lock2 = new ReentrantLock2();
        new Thread(lock2::m1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(lock2::m2).start();
    }
}
