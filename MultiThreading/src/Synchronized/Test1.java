package Synchronized;

//synchronized关键字：用于对某个对象加锁
public class Test1 {
    private int count = 0;
    private Object o = new Object();
    public void m(){
        synchronized (o){//任何线程要执行下面的代码，必须要先拿到o的锁
            count--;
            System.out.println(Thread.currentThread().getName()+"count="+count);
        }
    }
}
