import javax.management.RuntimeErrorException;

public class AccessLocalVariableLambda {

    public static void test(Runnable test) {
        System.out.println("Task started .. ");
        test.run();
        System.out.println("task completed");

        if (17 < 18) {
            throw new RuntimeException("age cannot less than 18");
        }

        System.out.println("continue .....");
    }

    public static void main(String[] args) {
        AccessLocalVariableLambda v = new AccessLocalVariableLambda();

        test(() -> System.out.println("Hello"));
        test(() -> {
            int a = 3;
            int b = 9;
            System.out.println("Sum : " + a + b);
        });

    }

}
