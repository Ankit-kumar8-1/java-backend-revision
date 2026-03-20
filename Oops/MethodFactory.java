package Oops;

interface Car {
    void drive();
}

class SUV implements Car {
    @Override
    public void drive() {
        System.out.println("Driving SUV...");
    }
}

class Sedan implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Sedan...");
    }
}

class Truck implements Car {
    @Override
    public void drive() {
        System.out.println("Driving Truck...");
    }
}

class CarFactory {
    public static Car createCar(String type) {
        if (type.equalsIgnoreCase("SUV")) {
            return new SUV();
        } else if (type.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (type.equalsIgnoreCase("Truck")) {
            return new Truck();
        } else {
            throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}

public class MethodFactory {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("SUV");
        Car car2 = CarFactory.createCar("Sedan");
        Car car3 = CarFactory.createCar("Truck");
        car1.drive();
        car2.drive();
        car3.drive();
    }
}
