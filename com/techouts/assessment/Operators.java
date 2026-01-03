package com.techouts.assessment;

public class Operators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        //Arithmetic Operations
        System.out.println("Addition (num1+num2) : "+ (num1 + num2));
        System.out.println("Subtraction (num1-num2) : "+(num1-num2));
        System.out.println("Multiplication (num1 * num2) : "+(num1 * num2));
        System.out.println("Modulo Division (num1 % num2) :"+ (num1 % num2));
        System.out.println("Division (num2 / num1) : "+num2 / num1);

        //Relational Operations
        System.out.println("Greater than : "+ (num2 > num1));
        System.out.println("Less than : "+ (num1 < num2));
        System.out.println("Equal to: "+(num1== num2));
        System.out.println("Not Equal : "+(num1 != num2));

        //Logical Operations
        System.out.println("Logical AND : " + ((num1>num2) && (num2 >num1)));
        System.out.println("Logical OR : "+((num1>num2) ||(num2>num1)));
        System.out.println("Logical NOT : "+(!(num1 <= num2)));
    }
}