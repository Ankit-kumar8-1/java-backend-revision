package multhreading;

class Helper4 {

    public static synchronized void method1() {
        System.out.println("Method 1 , from helper 4 class");
    }

    public static synchronized void method2() {
        System.out.println("Method 2 , from helper 4 class");
    }
}

public class ClassLevelLocak {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            Helper4.method1();
        });

        Thread t2 = new Thread(() -> {
            Helper4.method2();
        });

        t1.start();
        t2.start();

    }
}
