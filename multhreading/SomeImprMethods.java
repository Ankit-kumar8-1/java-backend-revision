package multhreading;

public class SomeImprMethods {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("thread 2");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Threas 3");
        });

        t1.start();

    }
}
