package parctice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
实现一个容器，提供两个方法，add，size
写两个线程，线程1添加10个元素到容器中，线程2实现监控线程元素的个数，当个数到五个时，线程2输出提示并结束。

给List添加volatile之后，t2能够得到通知，但是，t2线程的死循环很浪费cpu,如果不用死循环，该怎么做？
 */
public class MyContainer2 {
    volatile List lists = new ArrayList();//添加volatile关键字，使t2能够得到通知

    public void add(Object o) {
        lists.add(o);
    }

    public int size() {
        return lists.size();
    }

    public static void main(String[] args) {
        MyContainer2 myContainer2 = new MyContainer2();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                myContainer2.add(new Object());
                System.out.println("add" + i);

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1").start();

        new Thread(() -> {
            while (true) {
                if (myContainer2.size() == 5) {
                    break;
                }
            }
            System.out.println("t2 结束");
        }, "t2").start();
    }
}
