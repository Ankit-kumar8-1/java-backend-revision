package java8.DefaultAndStatic;

public class DefaultR {

    public static void main(String[] args) {
        System.out.println("Programme is running ....");
        Dog dog = new Dog();
        dog.sound();

        bus bus = new bus();
        bus.horn();
        bus.sound();

    }
}

@FunctionalInterface
interface Animal {
    void sound();

    default void horn() {
        System.out.println("Beep beep !");
    }

}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog is sound ");
    }

}

class bus implements Animal {

    @Override
    public void sound() {
        System.out.println("tac tac tac ");
    }

    @Override
    public void horn() {
        System.out.println("truck po po po ..");
    }

}