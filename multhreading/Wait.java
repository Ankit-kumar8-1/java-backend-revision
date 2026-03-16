package multhreading;

public class Wait {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread  -1 waiting ....");
                try {
                    lock.wait();
                } catch (InterruptedException exception) {
                    System.out.println(exception);
                }

                System.out.println("Thread 1 is resumed..");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("thread 1 is notifing ...");
                lock.notify();
            }
        });

        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

        t2.start();
    }
}
