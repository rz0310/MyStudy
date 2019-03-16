package ProducerCustomerDemo;
/*
�����߳�Эͬ��������������������

sleep�����߳̽�������״̬���ó�CPU��ʱ��Ƭ�����ͷŶ��������������Ȩ(������)
wait:���߳̽���ȴ�״̬���ó�CPU��ʱ��Ƭ�����ͷŶ��������������Ȩ���ȴ������߳�ͨ��
notify()���������̡߳�
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
������
 */
class Producer1 implements Runnable{
    private Food food;

    public Producer1(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            ����ʳ��
            if(i%2==0){
                food.set("����","����");
            }else{
                food.set("�ϴ�","����");
            }
        }
    }
}
/*
������
 */
class Customer1 implements Runnable{
    private Food food;
    public Customer1(Food food){
        this.food = food;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
//            ����ʳ��
            food.get();
        }
    }
}

class Food1{
    private String name;
    private String desc;
//    flagΪtrue��ʾ��������(��������)��falseΪ��������(��������)
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
//����
    public synchronized void set(String name,String desc){
//        ��������
        if(!flag){
            try {
//              �߳̽���ȴ�״̬���ͷż�����������Ȩ
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
        this.notify();//���ѵȴ����߳�(�����߳��е����һ��)
        System.out.println("����");
    }
//����
    public synchronized void get(){
//        ��������
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
        System.out.println("����");
    }
}