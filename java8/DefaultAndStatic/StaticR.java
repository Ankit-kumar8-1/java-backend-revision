package java8.DefaultAndStatic;

public class StaticR {
    public static void main(String[] args) {

        System.out.println("Programm is running");
        Z.b();
        StaticR r = new StaticR();

    }

}

@FunctionalInterface
interface Z {
    void fun();

    static void b() {
        System.out.println("I am static method");
    }
}