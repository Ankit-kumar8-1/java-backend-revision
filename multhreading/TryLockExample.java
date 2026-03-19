package multhreading;

import java.util.concurrent.locks.ReentrantLock;

class Helper8 {

    ReentrantLock lock1 = new ReentrantLock();

    public void method(String name) {

        if (lock1.tryLock()) {
            try {
                System.out.println(name + " : Acquired the lock...");
            } finally {
                lock1.unlock();
            }
        } else {
            System.out.println(name + " : Could not acquire the lock...");
        }
    }

}

public class TryLockExample {
    public static void main(String[] args) {
        Helper8 helper8 = new Helper8();

        Thread t1 = new Thread(() -> {
            helper8.method("Thread 1");
        });

        Thread t2 = new Thread(() -> {
            helper8.method("Thread 2");
        });

        t1.start();
        t2.start();
    }
}
