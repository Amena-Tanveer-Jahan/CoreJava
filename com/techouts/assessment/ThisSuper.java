package com.techouts.assessment;
class Parent{
    String name;
    Parent(String name){
        this.name = name;
    }
    void display(){
        System.out.println("Parent : "+name);
    }
}
class Child extends Parent{
    String name;
    Child(String pName, String cName){
        super(pName);
        this.name=cName;
    }
    @Override
    void display(){
        super.display();
        System.out.println("Child : " +name);
    }

}
public class ThisSuper {
    public static void main(String[] args){
        Child c = new Child("Parent Name","Child Name");
        c.display();
    }
}


