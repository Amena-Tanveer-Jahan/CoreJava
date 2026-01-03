package com.techouts.assessment;

public class Constructors {
    int num1;
    String value;
    Constructors(){
        System.out.println("DEfault Constructor");
    }
    Constructors(int num1, String value){
        this.num1 = num1;
        this.value = value;
        System.out.println("Parameterized Constructor");
    }
    public static void main(String[] args){
        Constructors c=new Constructors();
        Constructors c1 = new Constructors(10,"Hi");
        System.out.println("Default :"+c.num1 +" "+ c.value);
        System.out.println("Parameterized : "+c1.num1 +" " +c1.value);
    }
}
