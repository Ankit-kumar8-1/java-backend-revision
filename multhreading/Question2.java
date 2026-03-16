package multhreading;

class Bank extends Thread {

    int balance = 1000;

    public synchronized void withdraw(int money) {
        if (money <= balance) {
            System.out.println(Thread.currentThread().getName() + " withdrawing...");

            balance = balance - money;
            System.out.println("Remaining balance : " + balance);
        } else {
            System.out.println("Insufficent balance ");
        }
    }
}

public class Question2 {

    public static void main(String[] args) throws InterruptedException {

        Bank bank = new Bank();

        Thread t1 = new Thread(() -> {
            bank.withdraw(900);
        });

        Thread t2 = new Thread(() -> {
            bank.withdraw(900);
        });

        t1.start();
        t2.start();

        Temp t = new Temp();

        System.out.println("second example ...");
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                t.method();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                t.method();
            }
        });

        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                t.method();
            }
        });

        t3.start();
        t4.start();
        t5.start();

        t3.join();
        t4.join();
        t5.join();

        System.out.println(t.incremnet);
    }
}

class Temp extends Thread {
    int incremnet = 0;

    public synchronized void method() {
        incremnet++;
    }
}