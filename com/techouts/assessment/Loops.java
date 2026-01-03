package com.techouts.assessment;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Iteration : " + i);
        }
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while (num > 0 && num < 10) {
            System.out.println(num);
            num++;
        }
        do{
            System.out.println("Do's : "+num);
            num++;
        }while (num <10);
    }
}
