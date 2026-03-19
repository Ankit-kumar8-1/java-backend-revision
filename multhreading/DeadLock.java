package multhreading;

class Helper5 {

    Object lock1 = new Object();
    Object lock2 = new Object();

    void method1() {
        synchronized (lock1) {
            System.out.println("Thread 1 : Holding lock 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (lock2) {
                System.out.println("Thread 1 : Holding lock 1 & lock 2...");
            }
        }
    }

    void method2() {
        synchronized (lock2) {
            System.out.println("Thread 2 : Holding lock 2...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (lock1) {
                System.out.println("Thread 2 : Holding lock 1 & lock 2...");
            }
        }
    }
}

public class DeadLock {
    public static void main(String[] args) {

        Helper5 helper5 = new Helper5();

        Thread t1 = new Thread(() -> {
            helper5.method1();
        });

        Thread t2 = new Thread(() -> {
            helper5.method2();
        });

        t1.start();
        t2.start();

    }
}
