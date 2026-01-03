package com.techouts.assessment;
interface Animalss{
   void sound();
}
class Dogs implements Animalss{
    public void sound(){
        System.out.println("Bow Bow");
    }
}
class Cats implements Animalss{
    public void sound(){
        System.out.println("Meow Meow");
    }
}
public class Interface {
    public static void main(String[] args) {
        Cats c = new Cats();
        c.sound();
        Dogs d = new Dogs();
        d.sound();

    }
}
//Abstraction means hiding implementation details and showing only essential features to the user.
//In Java, interfaces and abstract classes are the used for achieving abstraction.
//The interface does not tell HOW the sound is made, it only defines what behavior is expected