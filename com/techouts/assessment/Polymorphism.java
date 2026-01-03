package com.techouts.assessment;


class Show3{
    void show(String value){
        System.out.println(value);
    }
}
class Show4 extends Show3{
    @Override
    void show(String value){
        System.out.println(value +" "+ " from show4");
    }
}

public class Polymorphism {
    public static void main(String[] args){
        Show3 obj = new Show3();
        obj.show("Hello");
        Show3 obj2 = new Show4();
        obj2.show("Hi");
    }
}

