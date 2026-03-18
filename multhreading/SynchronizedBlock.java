package multhreading;

class test19 {
    int count = 0;
    int a = 3000;

    public void method() {
        synchronized (this) {
            count++;
        }

        synchronized (this) {
            a--;
        }

    }

}

public class SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        test19 t = new test19();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                t.method();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                t.method();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                t.method();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final count : " + t.count);
        System.out.println("Final a : " + t.a);
    }
}
