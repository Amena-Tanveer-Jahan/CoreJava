package com.techouts.assessment;

public class GradeCalculation {
    public static void main(String[] args){
        int marks=80;
        if(marks>90){
            System.out.println("O Grade");
        } else if (marks >= 80 && marks <= 90){
            System.out.println("A Grade");
        } else if (marks >= 70 && marks <80){
            System.out.println("B Grade");
        } else if (marks >= 60 && marks <70){
            System.out.println("C Grade");
        } else if (marks >= 50 && marks <60) {
            System.out.println("D Grade");
        } else if (marks >=40 && marks < 50){
            System.out.println("E Grade");
        } else {
            System.out.println("F :Work hard to score more");
        }
    }


}
