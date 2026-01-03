package com.techouts.assessment;

class Engine {
 int power;

    Engine(int power) {
        this.power = power;
    }

}

class Car {
   String model;
   Engine engine;

    Car(String model, int power) {
        this.model = model;
        this.engine = new Engine(power);
    }
}

public class Composition{
    public static void main(String[] args) {
        Car car = new Car("Compact", 120);
        System.out.println("Car model: " + car.model);
        System.out.println("Engine power: " + car.engine.power);
    }
}
