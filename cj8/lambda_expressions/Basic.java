package cj8.lambda_expressions;

import java.util.Scanner;

interface Operations {
    int operations(int num1,int num2);
}
public class Basic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        Operations add = (a,b) -> a+b;
        int addition = add.operations(n1,n2);
        System.out.println("Addition of values is :" +addition);

        Operations mul = (a,b) -> a*b;
        int multi = mul.operations(n1,n2);
        System.out.println("Multiplication: "+multi);
    }
}
