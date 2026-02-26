package java8.Optional;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;

public class CreatingOptional {
    public static void main(String[] args) {

        // Use when we are 100% sure value is NOT null
        Optional<String> optional = Optional.of("Ankit");
        System.out.println(optional);

        // its return error NullPointerExpection
        // optional = Optional.of(null);
        // System.out.println(optional); // thorw error

        // Use when value CAN be null — SAFE!
        String name = null;
        Optional<String> containName = Optional.ofNullable(name);
        System.out.println(containName);

        Optional<String> containName2 = Optional.ofNullable("Rohit");
        System.out.println(containName2);

        Optional<String> emOptional = Optional.empty();
        System.out.println(emOptional);
    }

}
