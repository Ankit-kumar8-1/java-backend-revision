package multhreading;

class test1 extends Thread {

    @Override
    public void run() {
        System.out.println("thread is started...");
    }

}

public class Main01 {
    public static void main(String[] args) {
        test1 t = new test1();
        Test2 test2 = new Test2();
        Thread thread = new Thread(test2);
        Thread thread2 = new Thread();
        Test3 test3 = new Test3();
        Thread thread3 = new Thread(test3);
        t.start();
        thread.start();
        thread3.start();

    }
}

class Test2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable interface thread is started...");
    }
}

class Test3 implements Runnable {

    @Override
    public void run() {
        System.out.println("Test3 thread is running ....");
    }

}
