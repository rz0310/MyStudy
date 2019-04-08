package InterviewQuestion;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
面试题：写一个固定容量的同步容器。拥有put、get以及getCount方法
能够支持2个生产者线程以及10个消费者线程的阻塞调用
使用wait和notifyAll来实现。

使用lock和condition实现：condition可以更加精确的指定哪些线程被唤醒

注意：lock一般和await、signal/signalAll使用
 */
public class MyContainer2<T> {
    private LinkedList<T> list = new LinkedList<>();
    private final int MAX = 10;
    private int count = 0;

    Lock lock = new ReentrantLock();
    private Condition producer = lock.newCondition();
    private Condition consumer = lock.newCondition();

    public void put(T t){
        try {
            lock.lock();
            while(list.size() == MAX){
                producer.await();
            }
            list.add(t);
            count++;
            consumer.signalAll();//通知所有消费者线程进行消费
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public T get() {
        T t = null;
        try {
            lock.lock();
            while(list.size() == 0){
                consumer.await();
            }
            t = list.removeFirst();
            count--;
            producer.signalAll();//通知所有生产者线程生产
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return t;
    }

    public static void main(String[] args) {
        MyContainer2<String> c = new MyContainer2<>();
//        启动消费者线程
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                for (int j = 0; j < 5; j++) {
                    System.out.println(c.get());
                    System.out.println(Thread.currentThread().getName());
                }
            },"消费者"+i).start();
        }
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        启动生产者线程
        for (int i = 0; i < 2; i++) {
            new Thread(()->{
                for (int j = 0; j < 25; j++) {
                    c.put("Thread"+Thread.currentThread().getName()+" "+j);
                }
            },"生产者"+i).start();
        }
    }
}
