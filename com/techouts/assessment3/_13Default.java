package com.techouts.assessment3;

interface A{
    default void show(){
        System.out.println("I am show in A");
    }
   static void display(){
        System.out.println("Hello");
    }
}
interface B{
    default void show(){
        System.out.println("I am show in B");
    }
    void see();
}
class C implements A,B{
    public void see(){
        System.out.println("Hey i got implemented");
    }

    @Override
    public void show() {
        A.super.show();
        B.super.show();
    }
}

public class _13Default {
    static void main() {
        C c = new C();
        c.see();
        c.show();
    }
}
