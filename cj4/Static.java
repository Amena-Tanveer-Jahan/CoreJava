package cj4;


public class Static {
    // Static field
    static int counter = 0;

    // Static block
    static {
        System.out.println("Static block: class initialized");
    }

    // Static method
    static void increment() {
        counter++;
    }

    // Static nested class
    static class Helper {
        static String info() { return "I'm a static nested class"; }
    }

    public static void main(String[] args) {
        System.out.println("Counter = " + Static.counter);
        Static.increment();
        System.out.println("Counter after increment = " + Static.counter);
        System.out.println(Static.Helper.info());
    }
}
