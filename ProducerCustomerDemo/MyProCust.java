package ProducerCustomerDemo;
/*
两个线程协同工作，先生产，再消费

sleep：让线程进入休眠状态，让出CPU的时间片，不释放对象监视器的所有权(对象锁)
wait:让线程进入等待状态，让出CPU的时间片，并释放对象监视器的所有权，等待其他线程通过
notify()唤醒其他线程。
 */
public class MyProCust {
    public static void main(String[] args) {
        Food food = new Food();
        Producer p = new Producer(food);
        Customer c = new Customer(food);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
/*
生产者
 */
class Producer1 implements Runnable{
    private Food food;

    public Producer1(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            生产食物
            if(i%2==0){
                food.set("静静","香香");
            }else{
                food.set("聪聪","臭臭");
            }
        }
    }
}
/*
消费者
 */
class Customer1 implements Runnable{
    private Food food;
    public Customer1(Food food){
        this.food = food;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            消费食物
            food.get();
        }
    }
}

class Food1{
    private String name;
    private String desc;
//    flag为true表示可以生产(不能消费)，false为可以消费(不能生产)
    private boolean flag = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Food1() {
    }

    public Food1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
//生产
    public synchronized void set(String name,String desc){
//        不能生产
        if(!flag){
            try {
//              线程进入等待状态，释放监视器的所有权
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setName(name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setDesc(desc);
        flag = false;
        this.notify();//唤醒等待的线程(其他线程中的随机一个)
        System.out.println("生产");
    }
//消费
    public synchronized void get(){
//        不能消费
        if(flag){
            try{
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName()+"->"+this.getDesc());
        flag = true;
        this.notify();
        System.out.println("消费");
    }
}