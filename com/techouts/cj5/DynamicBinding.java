package com.techouts.cj5;

class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child method");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Parent obj = new Child();
        Parent obj1 = new Parent();
        obj1.display();
        obj.display();
    }
}

