package com.techouts.assessment3;

interface Aa{
    static void display(){
        System.out.println("I am a static method in interface Aa");
    }
}
interface  Bb{
    static void show(){
        System.out.println("I am static method in interface Bb");
        Aa.display(); // Call it by InterfaceName.MethodName
    }
}

public class _14StaticMethods {
    static void main() {
        Bb.show();
    }
}
