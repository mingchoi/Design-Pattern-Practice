package io.github.mingchoi.design.pattern.practice;

interface Car {
    void ride();
}

class SportsCar implements Car {
    public void ride() {
        System.out.println("Sports Car on the ride.");
    }
}

class Minivan implements Car {
    public void ride() {
        System.out.println("Minivan on the ride.");
    }
}

class AbstractFactory {
    static Car produce(String type) {
        switch (type) {
        case "sports":
            return new SportsCar();
        case "minivan":
            return new Minivan();
        }
        return null;
    }

    public static void main(String[] args) {
        Car car = produce("minivan");
        car.ride();
    }
}
