package com.techouts.assessment2.exceptions;

import java.util.Scanner;

public class ExecutionFlow {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your first number");
            int num1 = sc.nextInt();
            System.out.println("Enter your second number");
            int num2 = sc.nextInt();
            int div = num1/num2;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("It will be executed in all conditions");
        }
    }
}

/*
In try block we will write the code which can throw an exceptio.
The catch blocks will handle the exception
The finally block will get executed if an error occurs or not,
and it is used to close the resources.
One Catch or finally is compulsory with try.
 */
/*At first in try block when an exception occurs then it will search whether any catch block is handling the exception
if catch block is there which is handling the exception then ok otherwise the JVM will throw the exception and terminates the program.
finally will get executed after catch

 */