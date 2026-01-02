package com.techouts.cj4;


class Car1 {
    String brand;
    Engine engine;

    Car1(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType);
    }

    void show() {
        System.out.println("Car: " + brand + ", Engine: " + engine.type);
    }


    static class Engine {
        String type;
        Engine(String type) { this.type = type; }
    }
}

public class Composition{
    public static void main(String[] args) {
        Car1 car = new Car1("Honda", "i-VTEC");
        car.show();
    }
}
