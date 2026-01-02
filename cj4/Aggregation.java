package cj4;

class Engine {
    String type;
    Engine(String type) {
        this.type = type;
    }
}

class Car {
    String brand;
    Engine engine;

    Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    void showDetails() {
        System.out.println("Car: " + brand + ", Engine: " + engine.type);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Engine e = new Engine("V8");
        Car c = new Car("BMW", e);
        c.showDetails();
    }
}
