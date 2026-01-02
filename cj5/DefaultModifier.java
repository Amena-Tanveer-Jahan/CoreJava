package cj5;
import cj4.*;
class Car {
    String model;
}

public class DefaultModifier{

    public static void main(String[] args){
       TypesOfInherit obj = new TypesOfInherit();
       //obj.showA();
        Car c = new Car();
        c.model = "Tesla";
        System.out.println(c.model);
    }
}