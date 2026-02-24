interface Greeting {
    int cal(int a, int b);

    default void second() {
        System.out.println("Good Bye !");
    }
}
