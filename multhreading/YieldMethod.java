package multhreading;

class YieldExample extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {

            System.out.println(Thread.currentThread().getName() + " : " + i);

            Thread.yield();
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {

        YieldExample y = new YieldExample();
        YieldExample y2 = new YieldExample();

        y.start();
        y2.start();
    }
}
