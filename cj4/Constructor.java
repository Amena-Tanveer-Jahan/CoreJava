package cj4;

public class Constructor {

    static class DefaultCtor {
        int x;  // defaults to 0

        public DefaultCtor() {
            System.out.println(" Default constructor called");
            x = 10;
        }
    }

    static class ParamCtor {
        String name;
        int age;

        public ParamCtor(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static class CtorOverload {
        int a;
        String b;

        public CtorOverload() {
            this(0, "default"); // delegate to another constructor
            System.out.println(" no-arg ctor");
        }

        public CtorOverload(int a) {
            this(a, "unknown");
            System.out.println(" 1-arg ctor");
        }

        public CtorOverload(int a, String b) {
            this.a = a;
            this.b = b;
            System.out.println("2-arg ctor");
        }
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
            System.out.println(" Person(name) constructor");
        }
    }

    static class Employee extends Person {
        int empId;

        Employee(String name, int empId) {
            super(name);
            this.empId = empId;
            System.out.println(" Employee(name, empId) constructor");
        }
    }

    //copy
    static class CopyCtorDemo {
        private final String title;
        private final int pages;

        public CopyCtorDemo(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }

        // Copy constructor
        public CopyCtorDemo(CopyCtorDemo other) {
            this.title = other.title;
            this.pages = other.pages;
            System.out.println(" Copy constructor called");
        }

        @Override
        public String toString() {
            return "CopyCtorDemo{title='" + title + "', pages=" + pages + "}";
        }
    }

    /* =========================
     * 7) Private constructor (Singleton)
     * ========================= */
    static class SingletonDemo {
        private static final SingletonDemo INSTANCE = new SingletonDemo();

        private SingletonDemo() {
            System.out.println(" Private constructor invoked");
        }

        public static SingletonDemo getInstance() {

            return INSTANCE;
        }
    }


    public static void main(String[] args) {
        System.out.println("===  Default (no-arg) constructor ===");
        DefaultCtor d0 = new DefaultCtor();
        System.out.println("x = " + d0.x);
        System.out.println();

        System.out.println("=== Parameterized constructor ===");
        ParamCtor p1 = new ParamCtor("Ameena", 22);
        System.out.println("ParamCtorDemo: " + p1.name + " - " + p1.age);
        System.out.println();

        System.out.println("===  Constructor Overloading + this() ===");
        CtorOverload od1 = new CtorOverload();
        CtorOverload od2 = new CtorOverload(5);
        CtorOverload od3 = new CtorOverload(7, "java");
        System.out.println("od1 -> " + od1.a + ", " + od1.b);
        System.out.println("od2 -> " + od2.a + ", " + od2.b);
        System.out.println("od3 -> " + od3.a + ", " + od3.b);
        System.out.println();

        System.out.println("===  super() calling parent constructor (Inheritance) ===");
        Employee e = new Employee("Ameena", 101);
        System.out.println("Employee: " + e.name + " - " + e.empId);
        System.out.println();

        System.out.println("=== Copy Constructor (pattern) ===");
        CopyCtorDemo original = new CopyCtorDemo("Java Basics", 120);
        CopyCtorDemo copy = new CopyCtorDemo(original);
        System.out.println("Original: " + original);
        System.out.println("Copy    : " + copy);
        System.out.println();


        System.out.println("===  Private constructor (Singleton) ===");
        SingletonDemo s1 = SingletonDemo.getInstance();
        SingletonDemo s2 = SingletonDemo.getInstance();
        System.out.println("Singleton same instance? " + (s1 == s2));
        System.out.println();


    }
}