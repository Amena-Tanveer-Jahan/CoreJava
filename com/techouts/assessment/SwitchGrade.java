package com.techouts.assessment;
import java.util.Scanner;
public class SwitchGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();
        switch (marks / 10){
            case 10 : System.out.println("Grade A"); break;
            case 9 : if(marks >=91){
                System.out.println("Grade A");
            } else {
                System.out.println("Grade B");
            } break;
            case 8 : System.out.println("Grade B"); break;
            case 7 : System.out.println("Grade C"); break;
            case 6 : System.out.println("Grade D"); break;
            case 5 : System.out.println("Grade E"); break;
            default: System.out.println("Grade F");
        }
    }
}
