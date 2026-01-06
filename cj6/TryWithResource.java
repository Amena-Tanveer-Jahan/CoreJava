package cj6;

import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)) {
            System.out.println("Enter the value of num1: ");
            int num1=sc.nextInt();
            System.out.println("Enter the value of num2: ");
            int num2 = sc.nextInt();
            int div = num1/num2;
            System.out.println(div);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
