public class AccessLocalVariableLambda {

    public static void test(Runnable test) {
        System.out.println("Task started .. ");
        test.run();
        System.out.println("task completed");
    }

    public static void main(String[] args) {
        AccessLocalVariableLambda v = new AccessLocalVariableLambda();

        test(() -> System.out.println("Hello "));
        test(() -> {
            int a = 3;
            int b = 9;
            System.out.println("Sum : " + a + b);
        });

    }
}
