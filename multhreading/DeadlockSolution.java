package multhreading;

class Helper6 {

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
        synchronized (lock1) { // Changed lock2 to lock1
            System.out.println("Thread 2 : Holding lock 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            synchronized (lock2) { // Changed lock1 to lock2
                System.out.println("Thread 2 : Holding lock 1 & lock 2...");
            }
        }
    }
}

public class DeadlockSolution {
    public static void main(String[] args) {

        Helper6 helper6 = new Helper6();

        Thread t1 = new Thread(() -> {
            helper6.method1();
        });

        Thread t2 = new Thread(() -> {
            helper6.method2();
        });

        t1.start();
        t2.start();
    }
}
