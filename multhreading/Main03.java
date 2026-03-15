package multhreading;

class Multhreading extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}

public class Main03 {
    public static void main(String[] args) {
        Multhreading process = new Multhreading();
        Multhreading process2 = new Multhreading();
        process.start();
        process2.start();
    }
}
