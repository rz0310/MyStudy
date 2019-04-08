package Synchronized;

public class Test3 {
    private static int count = 10;

    public synchronized static void m() {//这里等同于synchronized (Test3.class)
        count--;
        System.out.println(Thread.currentThread().getName() + "count=" + count);
    }
    public static void mm(){
        synchronized (Test3.class){//此处不可用this代替,static方法中不能引用this
            count--;
        }
    }
}
