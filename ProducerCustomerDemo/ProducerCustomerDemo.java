package ProducerCustomerDemo;

public class ProducerCustomerDemo {
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
class Producer implements Runnable{
    private Food food;

    public Producer(Food food) {
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
class Customer implements Runnable{
    private Food food;
    public Customer(Food food){
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

class Food{
    private String name;
    private String desc;

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

    public Food() {
    }

    public Food(String name, String desc) {
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

    public synchronized void set(String name,String desc){
        this.setName(name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setDesc(desc);
    }

    public synchronized void get(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName()+"->"+this.getDesc());
    }
}