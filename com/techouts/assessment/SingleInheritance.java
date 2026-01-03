package com.techouts.assessment;

class Animal{
    void eat(){
        System.out.println("I am eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Bow Bow");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();
    }
}