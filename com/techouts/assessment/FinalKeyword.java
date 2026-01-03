package com.techouts.assessment;
public class FinalKeyword {

    public static final double PI = 3.14159;
     final int instanceId;

    public FinalKeyword(int instanceId) {

        this.instanceId = instanceId;
    }

    public final void showInfo() {

        System.out.println(" instanceId = " + instanceId + ", PI = " + PI);
    }

    public static void main(String[] args) {

        FinalKeyword demo = new FinalKeyword(101);
        demo.showInfo();

        System.out.println("PI = " + PI);

        final StringBuilder builder = new StringBuilder("Hello");
        System.out.println(" before: " + builder);
        builder.append(", Amena");
        System.out.println(" after append: " + builder);

        Child1 child = new Child1(202);
        child.showInfo();
        child.extra();
        System.out.println("sum = " + addNumbers(10, 20));
    }


    static int addNumbers(final int a, final int b) {
        // a = 99;  final parameter cannot be reassigned
        return a + b;
    }
}

class Parent1 {
    private final String tag = "ParentTag";

    public final void showInfo() {
        System.out.println(  tag + " cannot be overridden in child");
    }
}

class Child1 extends Parent1 {
    // public void showInfo() { } cannot override final method

    public void extra( ){
        System.out.println("Child extra method");
    }
    private final int childId;

    Child1(int id) {
        this.childId = id;
        System.out.println(" childId set to " + childId);
    }
}

