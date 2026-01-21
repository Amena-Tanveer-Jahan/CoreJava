package cj8;

 interface Foo {
    default void bar() {
        System.out.print("Hello");
        baz(); // calling private method
    }

    private void baz() {
        System.out.println(" world!");
    }

    static void staticMethod() {
        commonLogic();
    }

    private static void commonLogic() {
        System.out.println("Shared static logic");
    }
}

class Pm implements Foo{
     void show(){
         System.out.println("Im in class");
         Foo.staticMethod(); //static method
         bar(); //default method
         //baz(); Cannot access because it has private scope

     }
}
public class PrivateMethods {
    static void main() {
        Pm obj = new Pm();
        obj.show();

    }
}