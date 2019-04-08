package parctice;

public class TestDeadLock {
    public static void main(String[] args) {
        new DeadLock().m1();
        new DeadLock().m2();
    }
}
