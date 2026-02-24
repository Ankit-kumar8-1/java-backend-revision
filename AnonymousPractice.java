
abstract class Animal {

    abstract void dog();

    abstract void cat();

}

public class AnonymousPractice {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            void dog() {
                System.out.println("Dog ke bak");
            }

            void cat() {
                System.out.println("cat is me aa uu ...");
            }
        };

        animal.cat();
        animal.dog();
    }
}
