package multhreading;

class Logic {

}

class MyThread extends Thread {
}

class Second extends MyThread implements Runnable {
    public void run() {
        System.out.println("Task running");
    }

    public int run(int a) {
        return a + 1;
    }

}

public class DiffEThreadAImpRunnable {
    public static void main(String[] args) {

        MyThread thread = new MyThread();
        MyThread thread2 = new MyThread();
        thread.start();
        thread2.start();

        Runnable task = new Second();
        Thread t1 = new Thread(() -> {
            task.run();
        });

        t1.start();

        Test9 t9 = new Test9();
        Thread thread9 = new Thread(t9);
        thread9.start();

        Thread thread3 = new Thread(() -> {
            System.out.println("i am thread 3");
        });

        thread.start();

    }
}

class Test9 implements Runnable {
    public void run() {
        System.out.println("Test 9  thread");
    }

}