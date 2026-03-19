package multhreading;

import java.util.concurrent.locks.ReentrantLock;

class Helper7 {

    int count = 0;
    ReentrantLock lock = new ReentrantLock();

    public void method1() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

}

public class ReentrantLockE {

    public static void main(String[] args) {

        Helper7 helper7 = new Helper7();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                helper7.method1();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                helper7.method1();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Count : " + helper7.count);

    }
}