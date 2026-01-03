package com.techouts.assessment;
class Example{
    void display(){
        System.out.println("Example method");
    }
}
class Example2 extends Example{
    @Override
    void display(){
        System.out.println("Example 2 method");
    }
}
public class DynamicBinding {
    public static void main(String[] args){
        Example obj =  new Example2();
        obj.display(); //it takes object type not reference
    }
}


