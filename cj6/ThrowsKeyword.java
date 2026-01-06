package cj6;

import java.util.Scanner;

public class ThrowsKeyword {
    public static void main(String[] args) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 =  sc.nextInt();
        int div = num1 / num2;
        System.out.println(div);
    }
}
