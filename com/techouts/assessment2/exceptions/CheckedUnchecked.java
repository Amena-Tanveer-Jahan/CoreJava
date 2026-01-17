package com.techouts.assessment2.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CheckedUnchecked {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        try{
            int div = num1/num2;
            System.out.println("Division : "+div);
        } catch (ArithmeticException e){         //Unchecked Exception
            System.err.println("Division by zero is not possible "+e);
        }
try(FileReader fr = new FileReader("assesment.txt")){ //Checked Exception should be handled at compile time only
    int ch;
    while ((ch = fr.read()) != -1) {
        System.out.println(ch);
    }
} catch (FileNotFoundException e) {
    System.out.println("File doe not exist "+ e);
} catch (IOException e) {
    System.out.println(e.getMessage());
}

    }
}
