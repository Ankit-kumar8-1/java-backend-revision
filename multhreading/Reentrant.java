package multhreading;

import java.util.concurrent.locks.ReentrantLock;

class Helper10 {

    ReentrantLock lock = new ReentrantLock();

    void method1() {
        lock.lock();
        try {
            System.out.println("Method 1 is executing...");
            method2(); // Reentrant call
        } finally {
            lock.unlock();
        }
    }

    void method2() {
        lock.lock();
        try {
            System.out.println("Method 2 is executing...");
        } finally {
            lock.unlock();
        }
    }
}

public class Reentrant {
    public static void main(String[] args) {

        Helper10 helper10 = new Helper10();

        Thread t1 = new Thread(() -> {
            helper10.method1();
        });

        Thread t2 = new Thread(() -> {
            helper10.method1();
        });

        t1.start();
        t2.start();
    }
}
