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
 */
public class MyContainer3 {
    volatile List lists = new ArrayList();//添加volatile关键字，使t2能够得到通知

    public void add(Object o) {
        lists.add(o);
    }

    public int size() {
        return lists.size();
    }

    public static void main(String[] args) {
        MyContainer3 myContainer3 = new MyContainer3();
        final Object lock = new Object();

        new Thread(() -> {
            synchronized (lock){
                System.out.println("t2启动");
                if(myContainer3.size() == 5){
                    try {
                        lock.wait();//当前线程等待，并且释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "t1").start();

        new Thread(() -> {
            System.out.println("t1启动");
           synchronized (lock){
               for (int i = 0; i < 10; i++) {
                   myContainer3.add(new Object());
                   System.out.println("add" + i);
                   if (myContainer3.size() == 5) {
                       lock.notify();//唤醒其他线程，但是不释放对象锁，t1唤醒了t2，但是没有释放锁
                   }
                   try {
                       TimeUnit.SECONDS.sleep(1);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
            System.out.println("t2 结束");
        }, "t2").start();
    }

}
