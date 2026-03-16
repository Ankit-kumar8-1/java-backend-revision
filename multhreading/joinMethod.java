package multhreading;

public class joinMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);

            }
        });

        t1.start();
        t1.join(); // Wait for t1 to finish before starting t2
        t2.start();
        t2.join();

        System.out.println("Both threads have finished execution.");

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable Thread: " + i);
            }
        };

        Thread t3 = new Thread(task);
        t3.start();

        Thread t4 = new Thread(task);
        t4.start();

    }
}
