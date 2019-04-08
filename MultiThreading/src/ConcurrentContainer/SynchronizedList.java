package ConcurrentContainer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = Collections.synchronizedList(list);//给List加锁
    }
}
