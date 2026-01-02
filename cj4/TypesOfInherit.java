package cj4;

// Single Inheritance
class A {
    void showA() {
        System.out.println("A");
    }
}
class B extends A {
    void showB() {
        System.out.println("B");
    }
}

// Multilevel Inheritance:

class C extends B {
    void showC() {
        System.out.println("C");
    }
}

// Hierarchical Inheritance:
class D extends A {
    void showD() {
        System.out.println("D");
    }
}
class E extends A {
    void showE() {
        System.out.println("E");
    }
}

public class TypesOfInherit{
    public static void main(String[] args) {
        B b = new B();
        b.showA(); b.showB();

        C c = new C();
        c.showA(); c.showB(); c.showC();

        D d = new D();
        d.showA(); d.showD();
        E e = new E();
        e.showA(); e.showE();

    }
}
