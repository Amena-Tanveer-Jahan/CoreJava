package cj6;

import java.util.Scanner;

class IllegalPasswordException extends Exception{
    IllegalPasswordException(String message){
        super(message);
    }
}
public class Password {
    void passwordCheck(String str) throws IllegalPasswordException {
        int UCount = 0;
        int DCount = 0;
        int SCount = 0;
        if (str.length() < 8) {
            throw new IllegalPasswordException("Password must be 8 characters");
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (Character.isUpperCase(str.charAt(i))) {
                    UCount++;
                }
            } else if (Character.isDigit(str.charAt(i))) {
                DCount++;
            } else {
                SCount++;
            }
        }
        if (UCount == 0) {
            throw new IllegalPasswordException("Atleast one UpperCase Letter is compulsory");
        } else if (DCount == 0) {
            throw new IllegalPasswordException("Atleast one digit is compulsory");
        } else if (SCount == 0) {
            throw new IllegalPasswordException("Atleast one special character is compulsory");
        } else {
            System.out.println("Valid Password");
        }
    }
    public static void main(String[] args){
        System.out.println("Password must be atleast 8 characters");
        System.out.println("1 or more special character is necessary");
        System.out.println("1 or more digits are compulsory");
        System.out.println("Atleast one Uppercase letter");

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your password");
            String str=sc.nextLine();
            Password obj = new Password();
            obj.passwordCheck(str);

        }catch (IllegalPasswordException e){
            System.err.println("Error "+e.getMessage());
        }
    }
}
