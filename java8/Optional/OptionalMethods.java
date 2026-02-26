package java8.Optional;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;

import java8.StreamAPIs.mapOperation;

public class OptionalMethods {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Ankit");
        Optional<String> name2 = Optional.empty();

        System.out.println(name.isPresent()); // true
        System.out.println(name2.isPresent()); // false

        System.out.println(name.isEmpty()); // false
        System.err.println(name2.isEmpty()); // true

        // older way
        if (name.isPresent()) {
            System.out.println(name.get().toUpperCase());
        }

        // new way ;
        name.ifPresent(n -> System.out.println(name.get().toUpperCase()));

        // no crash programe ( no print anything)
        Optional<String> emOptional = Optional.empty();
        emOptional.ifPresent(n -> System.out.println(emOptional.get()));

        // get name ( but it thorw exception NoSuchElementException)
        // String value = emOptional.get();
        // System.out.println(value);

        // get name
        String value2 = name.get();
        System.out.println(value2);

        // orElse
        System.out.println("TEST Methods");
        Optional<String> strOptional = Optional.empty();
        String reString = strOptional.orElse("strOptional is empty");
        System.out.println(reString);

        Optional<String> containVOptional = Optional.of("Rohit");
        String name2String = containVOptional.orElse("No value");
        System.out.println(name2String);

        // orElseGet

        String generateName = "shilpa";
        Optional<String> orElseGeOptional = Optional.empty();
        String string = orElseGeOptional.orElseGet(() -> generateName);
        System.out.println(string);

        Optional<String> OrElseThrowTesting = Optional.empty();
        // String getString = OrElseThrowTesting.orElseThrow(() -> new
        // RuntimeException("value is not present !"));
        // System.out.println(getString);

        // transforme value ;

        Optional<String> upperOptional = Optional.of("CHANDRESH");
        Optional<String> reString2 = upperOptional.map(s -> s.toLowerCase());
        System.out.println(reString2.get());

        Optional<Integer> age = Optional.of(20);

        // Keep value only if condition matches
        Optional<Integer> adult = age.filter(a -> a >= 18);
        System.out.println(adult);
        // Output: Optional[20] ✅

        Optional<Integer> age2 = Optional.of(15);
        Optional<Integer> adult2 = age2.filter(a -> a >= 18);
        System.out.println(adult2);
        // Output: Optional.empty (filtered out!)

        User user = new User("Rohit", null);
        String city = Optional.ofNullable(user)
                .map(u -> u.address)
                .map(u -> u.city)
                .orElse("Not city found");

        System.out.println(city);

        User user2 = new User("Amit", new Address("Mumbai"));
        String cityString = Optional.ofNullable(user2)
                .map(u -> u.address)
                .map(u -> u.city)
                .orElse("City not found");

        System.out.println(cityString);

    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class User {
    String name;
    Address address;

    User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

}