package multhreading;

class Helper1 {
    public void method1() {
        synchronized (this) {
            System.out.println("Method 1");
        }
    }

    public void method2() {
        synchronized (this) {
            System.out.println("Method 2");
        }
    }
}

public class Question4 {

    public static void main(String[] args) {

        Helper1 helper = new Helper1();

        Thread t1 = new Thread(() -> {
            helper.method1();
        });

        Thread t2 = new Thread(() -> {
            helper.method2();
        });

        // t1.start();
        // t2.start();

        Helper2 call1 = new Helper2(); // | -> dono parallel he chalenge kyoki dono alag alag
        Helper2 call2 = new Helper2(); // | object ka use kar rahe mean do thread aalg alag object per

        call1.method1();
        call2.method2();
    }
}

class Helper2 extends Thread {
    public void method1() {
        System.out.println("Method 1 , from Helper 2 class");
    }

    public void method2() {
        System.out.println("Method 2 , from Helper 2 class");
    }
}