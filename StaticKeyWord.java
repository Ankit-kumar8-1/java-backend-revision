
interface InnerStaticKeyWord {

    static void sum() {
        System.out.println("sum : " + (3 + 3));
    }
}

class A {
    static void hello() {
        System.out.println("Hello class A");
    }
}

public class StaticKeyWord {

    static void hello() {
        System.out.println("class Static keyword");
    }

    public static void main(String[] args) {

        A.hello();

    }
}
