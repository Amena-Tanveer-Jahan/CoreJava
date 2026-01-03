package com.techouts.assessment;

public class StaticBinding {
    void display(String msg){
        System.out.println(msg);
    }
    void display(int num){
        System.out.println(num);
    }
    public static void main(String[] args){
        StaticBinding obj = new StaticBinding(); //compiler decides which method to call by argument type
        obj.display(9);
        obj.display("Tanveer");
    }
}

