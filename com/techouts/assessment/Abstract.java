package com.techouts.assessment;
abstract class Animals{
    void eat(){
        System.out.println("Animals eat");
    }
    abstract void sound();
}
class Cat extends Animals{
    void sound(){
        System.out.println("meow meow");
    }
}
public class Abstract {
    public static void main(String[] args){
        Cat c= new Cat();
        c.eat();
        c.sound();
    }
}
