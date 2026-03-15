package multhreading;

public class Main02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1 is started...");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread 2 is started...");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3 is started ...");
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
