package cj6;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age < 0){
            throw new IllegalArgumentException("Age Cannot be less than zero");
        }
        System.out.println(age);
    }
}
