package com.techouts.assessment2.exceptions;

import java.util.Scanner;

class PhoneNumberFormatException extends Exception{
    PhoneNumberFormatException(String msg){
        super(msg);
    }
}
public class CustomException {
    void phoneNumberCheck(String str) throws PhoneNumberFormatException{
        if(str.length() != 10){
            throw new PhoneNumberFormatException("Length should be equal to 10");
        }
        for(int i=0;i<str.length();i++){
            if(!(Character.isDigit(str.charAt(i)))){
                throw new PhoneNumberFormatException("Only numbers are allowed");
            }
        }
        System.out.println("Valid Phone number");
    }
    public static void main(String[] args) throws PhoneNumberFormatException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone number");
        String str = sc.nextLine();
        CustomException obj = new CustomException();
        obj.phoneNumberCheck(str);
    }
}
