package cj6;

import java.util.Scanner;

class PhoneNumberFormatException extends Exception{
    PhoneNumberFormatException(String msg){
        super(msg);
    }
}
public class CustomException2 {
    void phoneNumberCheck(String str) throws PhoneNumberFormatException {
        if (str.length() != 10) {
            throw new PhoneNumberFormatException("Length should be equal to 10");
        }
        for (int i = 0; i < str.length(); i++) {
            if (!(Character.isDigit(str.charAt(i)))) {
                throw new PhoneNumberFormatException("Special characters are not allowed");
            }
        }
        System.out.println("Valid phone number");
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your phone number");
            String str = sc.nextLine();
            CustomException2 obj = new CustomException2();
            obj.phoneNumberCheck(str);

        } catch (PhoneNumberFormatException e) {
            System.err.println("Error" + e.getMessage());
        }
    }
}


