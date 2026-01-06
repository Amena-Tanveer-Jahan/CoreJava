package cj6;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a: ");
           int a=sc.nextInt();
           System.out.println("Enter the value of b: ");
           int b=sc.nextInt();
           int c=a/b;
           System.out.println("Division: "+c);
        } catch (ArithmeticException e) {
           System.out.println("Division by zero not posiible "+e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
