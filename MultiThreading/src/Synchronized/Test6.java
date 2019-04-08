package Synchronized;

public class Test6 {
    public synchronized void m1(){
        System.out.println(Thread.currentThread().getName() + " m1 start...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" m1 end");
    }
    public void m2(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" m2");
    }

    public static void main(String[] args) {
        Test6 test6 = new Test6();
        new Thread(()-> test6.m1(),"t1").start();
        new Thread(()->test6.m2(),"t2").start();

//        new Thread(test6::m1,"t1").start();
//        new Thread(test6::m2,"t2").start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                test6.m1();
//            }
//        });
    }
}
