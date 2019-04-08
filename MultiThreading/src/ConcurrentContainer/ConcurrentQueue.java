package ConcurrentContainer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueue {
    public static void main(String[] args) {
        Queue queue = new ConcurrentLinkedQueue();
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        System.out.println(queue);

        System.out.println(queue.size());

        queue.poll();
        System.out.println(queue.size());

        queue.peek();
        System.out.println(queue.size());
    }
}
