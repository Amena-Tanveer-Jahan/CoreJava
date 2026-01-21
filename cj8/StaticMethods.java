package cj8;

interface Demo1 {
    static void show() {
        System.out.println("Hello i am showww from interface");
    }
}

class Demo2 implements Demo1 {
    static void show1() {
        System.out.println("Hello i am show from class");
    }

    void display() {
        System.out.println("Hello i am display");
    }
}

public class StaticMethods {
    static void main() {
        Demo2 obj = new Demo2();
        obj.display();
        Demo2.show1();
        Demo1.show(); //Statics methods in interface can only call by interface name
    }
}
