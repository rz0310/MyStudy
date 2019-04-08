package Synchronized;

public class Test2 {
    private int count = 0;
    public void n(){
        synchronized (this){//执行下面的代码，必须要拿到this的锁
            count--;
            System.out.println(Thread.currentThread().getName()+"count="+count);
        }
    }
    public synchronized void nn(){//等同于synchronized (this)
    //执行下面的代码，必须要拿到this的锁
        count--;
        System.out.println(Thread.currentThread().getName()+"count="+count);
    }
}
