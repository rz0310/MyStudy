package ThreadTest;
/*
���߳���Ҫ������Դ�Ĺ�����Ҫ����ͬ������ͬ������Ϳ����������
 */
public class DeadThreadDemo {
    public static void main(String[] args) {
        new DeadThread();
    }
}
//�˿�
class Customer{
    public synchronized void say(Waiter w){
        System.out.println("�˿�˵���ȳԷ�����");
        w.doService();
    }

    public synchronized void doService(){
        System.out.println("ͬ���ˣ����굥�ٳԷ�");
    }

}
//����Ա
class Waiter{
    public synchronized void say(Customer c){
        System.out.println("����Ա˵�������ٳԷ�");
        c.doService();
    }

    public synchronized void doService(){
        System.out.println("ͬ���ˣ����극���굥");
    }
}
//�����߳�
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