package com.techouts.cj5;

public class StaticBindingOverLoad{
    void greet() {
        System.out.println("Hello!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    void greet(String name, int times) {
        System.out.println("Greeting " + name + " " + times + " time(s).");
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, " + name + "!");
        }
    }

    void greet(int times) {
        System.out.println("Hello , repeated " + times + " time(s).");
        for (int i = 0; i < times; i++) {
            System.out.println("Hello!");
        }
    }

    void show(int x) {
        System.out.println("show(int): " + x);
    }

    void show(double x) {
        System.out.println("show(double): " + x);
    }

    public static void main(String[] args) {
        StaticBindingOverLoad demo = new StaticBindingOverLoad();

        demo.greet();
        demo.greet("Amena");
        demo.greet("Amena", 2);
        demo.greet(3);

        demo.show(10);
        demo.show(10.5);
        byte b = 5;
        demo.show(b);
    }
}

