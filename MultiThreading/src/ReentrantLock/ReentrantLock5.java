package ReentrantLock;

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

ReentrantLock还可以指定为公平锁。
*/
public class ReentrantLock5 extends Thread {
    private static ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            lock.lock();
            try{
                System.out.println(Thread.currentThread().getName()+"获得锁");//设定为true时，指定该锁为公平锁。
            }finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLock5 lock5 = new ReentrantLock5();
        Thread thread1 = new Thread(lock5);
        Thread thread2 = new Thread(lock5);
        thread1.start();
        thread2.start();
    }
//    private Lock lock = new ReentrantLock(true);
//
//    public void testMethod()
//    {
//        try
//        {
//            lock.lock();
//            System.out.println("ThreadName" + Thread.currentThread().getName() + "获得锁");
//        }finally
//        {
//            lock.unlock();
//        }
//    }
//
//    public static void main(String[] args) throws Exception
//    {
//        final ReentrantLock5 td = new ReentrantLock5();
//        Runnable runnable = new Runnable()
//        {
//            public void run()
//            {
//                System.out.println("◆线程" + Thread.currentThread().getName() + "运行了");
//                td.testMethod();
//            }
//        };
//        Thread[] threads = new Thread[5];
//        for (int i = 0; i < 5; i++)
//            threads[i] = new Thread(runnable);
//        for (int i = 0; i < 5; i++)
//            threads[i].start();
//    }
}
