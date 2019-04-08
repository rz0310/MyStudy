package BetterSynchronized;

import java.util.concurrent.TimeUnit;

/*
不要使用字符串常量作为锁定对象。
在下面的例子中，m1和m2其实锁定的是同一个对象。
这种情况还会发生比较诡异的现象，比如你用到了一个类库，在该类库中代码锁定了字符串"Hello"
但是你读不到源码，所以你在自己的代码中也锁定了"Hello"，这时候就有可能发生非常诡异的死锁阻塞。
因为你的程序和用到的类库不经意间用到了同一把锁。
 */
public class Test3 {
    String s1 = "Hello";
    String s2 = "Hello";
    void m1(){
        synchronized (s1){
            System.out.println(Thread.currentThread().getName());
        }
    }
    void m2(){
        synchronized (s2){
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        new Thread(test3::m1,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(test3::m2,"t2").start();
    }
}

