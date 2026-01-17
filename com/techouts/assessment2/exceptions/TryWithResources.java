package com.techouts.assessment2.exceptions;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] srgs){
        try(Scanner sc = new Scanner(System.in)){ //here we are using try with resources, no need to close sc manually
            System.out.println("Enter num1");
            int num1 = sc.nextInt();
            System.out.println("Enter num2");
            int num2 = sc.nextInt();
            int sum = num1+num2;
            System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
        }
    }
}
//Even there is no need of writing catch or finally in this case
