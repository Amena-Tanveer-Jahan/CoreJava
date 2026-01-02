package cj4;

public class Super{

    static class Parent {
        String name = "Parent";

        Parent() {
            System.out.println("Parent constructor called");
        }

        void display() {
            System.out.println("Display from Parent");
        }
    }


    static class Child extends Parent {
        String name = "Child";

        Child() {
            super();
            System.out.println("Child constructor called");
        }

        void show() {
            System.out.println("Child name: " + name);
            System.out.println("Parent name: " + super.name); // Access parent field
            super.display(); // Call parent method
        }
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

