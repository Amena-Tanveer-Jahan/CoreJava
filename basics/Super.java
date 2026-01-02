package basics;

class A {
    A() {
    System.out.println("A");
    }
}
class B extends A {
    B() {
        super();
        System.out.println("B");
    }
}
class C extends B {
    C() {
        super();
        System.out.println("C");
    }
}

public class Super {
    public static void main(String[] args) {
        new C();
    }
}
