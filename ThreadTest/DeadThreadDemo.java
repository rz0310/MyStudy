package ThreadTest;
/*
多线程中要进行资源的共享，就要进行同步，但同步过多就可能造成死锁
 */
public class DeadThreadDemo {
    public static void main(String[] args) {
        new DeadThread();
    }
}
//顾客
class Customer{
    public synchronized void say(Waiter w){
        System.out.println("顾客说：先吃饭再买单");
        w.doService();
    }

    public synchronized void doService(){
        System.out.println("同意了，买完单再吃饭");
    }

}
//服务员
class Waiter{
    public synchronized void say(Customer c){
        System.out.println("服务员说：先买单再吃饭");
        c.doService();
    }

    public synchronized void doService(){
        System.out.println("同意了，吃完饭再完单");
    }
}
//死锁线程
class DeadThread implements Runnable{
    Customer c = new Customer();
    Waiter w = new Waiter();
    public DeadThread() {
        new Thread(this).start();
        w.say(c);
    }
    @Override
    public void run() {
        c.say(w);
    }
}