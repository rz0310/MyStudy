package BetterSynchronized;

import java.util.concurrent.TimeUnit;

/*
锁定某对象o,如果o的属性发生改变，不影响锁的使用
但是如果o变成另外一个对象，则锁定的对象发送改变
应该避免锁定的对象变成另外的对象。
 */
public class Test2 {
    Object o = new Object();
    void m(){
        synchronized (o){
            while(true){
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
    public static void main(String[] args){
        Test2 test2 = new Test2();
//        启动第一个线程
        new Thread(test2::m,"t1").start();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        创建第二个线程
        Thread t2 = new Thread(test2::m,"t2");
        test2.o = new Object();//锁对象发生改变，所以t2线程得以执行。如果去掉这句话，线程2将永远不会执行。
        t2.start();
    }
}
