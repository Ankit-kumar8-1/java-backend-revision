package multhreading;

class Helper9 {

    private int data;
    private boolean isDataAvailable = false;

    synchronized void produce(int value) {
        while (isDataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        isDataAvailable = true;

        System.out.println("Produced : " + data);
        notify();
    }

    synchronized void consume() {
        while (!isDataAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed : " + data);
        isDataAvailable = false;
        notify();
    }

}

public class WaitWithNotify {
    public static void main(String[] args) {

        Helper9 helper9 = new Helper9();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                helper9.produce(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                helper9.consume();
            }
        });

        producer.start();
        consumer.start();
    }
}
