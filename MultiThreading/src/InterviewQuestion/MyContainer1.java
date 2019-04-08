package InterviewQuestion;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/*
面试题：写一个固定容量的同步容器。拥有put、get以及getCount方法
能够支持2个生产者线程以及10个消费者线程的阻塞调用
使用wait和notifyAll来实现。

注意：synchronized一般和wait、notify/notifyAll使用
 */
public class MyContainer1<T> {
    private LinkedList<T> list = new LinkedList<>();
    private final int MAX = 10;
    private int count = 0;

    public synchronized void put(T t){
        //使用while是因为如果前一时刻消费者拿走了一个产品，此时两个生产者线程同时被唤醒，那么只有一个线程可以拿到锁，继续执行，
//        如果线程1添加了一个产品，此时容器又满了，如果使用while线程2在线程1执行完之后，还会判断一次容器是否满了，未满的话在添加，
//        但是如果是用if就不会在判断了，直接向容器中添加产品，那么就会出错。
        while (list.size() == MAX){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(t);
        ++count;
        this.notifyAll();//通知消费者线程进行消费
//使用notify()可能会出现死锁（如果当前线程是生产者，那么如果只唤醒了一个生产者线程，它判断当前的容量还是满的，那么就会继续等待，其他等待的线程因为没有人唤醒，所以不会执行，就会出现死锁）
    }
    public synchronized T get(){
        T t = null;
        while(list.size() == 0){
            try {
                this.wait();//wait大多数都和while一起使用
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        t = list.removeFirst();
        count--;
        this.notifyAll();//通知生产者进行生产
        return t;
    }

    public static void main(String[] args) {
        MyContainer1<String> c = new MyContainer1<>();
//        启动消费者线程
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j < 5; j++) {
                    System.out.println(c.get());
                    System.out.println(Thread.currentThread().getName());
                }
            },"消费者"+i).start();
        }
//        启动生产者线程
        for (int i = 0; i < 2; i++) {
            new Thread(()->{
                for (int j = 0; j < 25; j++) {
                    c.put("Thread"+Thread.currentThread().getName()+" "+j);
                }
            },"生产者"+i).start();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
