package Thread;

public class Thread1 extends Thread {
    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行：" + i);
            try {
                sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("A");
        Thread1 thread2 = new Thread1("B");
        thread1.start();
        thread1.start();//多次启动一个线程会报异常
        thread2.start();
    }
}
