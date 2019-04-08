package parctice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
实现一个容器，提供两个方法，add，size
写两个线程，线程1添加10个元素到容器中，线程2实现监控线程元素的个数，当个数到五个时，线程2输出提示并结束。

给List添加volatile之后，t2能够得到通知，但是，t2线程的死循环很浪费cpu,如果不用死循环，该怎么做？

这里需要用到wait和notify方法，wait会释放锁，notify也不会释放锁。
需要注意的是，运用这种方法，必须保证t2先执行，也就是首先要让t2监听才可以。

分析输出结果，可以读到输出结果并不是size=5时退出，而是t1结束时t2菜接收到通知而退出。为什么？

t1 notify之后，t1必须释放锁，唤醒t2，t2退出之后，也必须notify，通知t1继续执行。
整个通信过程比较繁琐。

使用latch(门闩)，替代wait notify来进行通知。
好处是通信方式简单，同时也可以指定等待时间。
使用await和countdown方法替代wait和notify。
CountdownLatch不涉及锁定，当count的值为零时，当前线程继续运行。
当不涉及同步，只是涉及线程通信的时候，用synchronized+wait/notify就显得太重了。
这时应该考虑countdownlatch/cyclicbarrier/semaphore
 */
public class MyContainer4 {
    volatile List lists = new ArrayList();//添加volatile关键字，使t2能够得到通知

    public void add(Object o) {
        lists.add(o);
    }

    public int size() {
        return lists.size();
    }

    public static void main(String[] args) {
        MyContainer4 myContainer4 = new MyContainer4();
        final Object lock = new Object();

        new Thread(() -> {
            synchronized (lock) {
                System.out.println("t2启动");//线程t2进行监控，等待线程t1的size变化，如果size!=5，则让t2一直等待
                if (myContainer4.size() != 5) {
                    try {
                        lock.wait();//当前线程等待，并且释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t2结束");
//                    唤醒线程t1继续执行
                    lock.notify();
                }
            }
        }, "t1").start();

        new Thread(() -> {
            System.out.println("t1启动");
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    myContainer4.add(new Object());
                    System.out.println("add" + i);
                    if (myContainer4.size() == 5) {
                        lock.notify();//当size=5时，唤醒线程t2，但是不释放对象锁
                        try {
                            lock.wait();//唤醒线程t2后，让当前线程等待，并释放锁
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("t1 结束");
        }, "t2").start();
    }
}
