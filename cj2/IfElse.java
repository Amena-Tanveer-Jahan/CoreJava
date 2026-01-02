package cj2;

public class IfElse {
    public static void main(String[] args) {
        int num = -5;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        int age = 18;
        if (age >= 18) {
            System.out.println("Adult");
            if (age >= 60) {
                System.out.println("Senior Citizen");
            }
        } else {
            System.out.println("Minor");
        }
    }
}
