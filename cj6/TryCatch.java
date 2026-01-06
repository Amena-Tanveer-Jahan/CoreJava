package cj6;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int[] arr = {1,2,3,4};
            System.out.println("Enter value of a: ");
            int a=sc.nextInt();
            System.out.println("Enter value of b: ");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
            System.out.println(arr[5]);
        }catch(ArithmeticException e){                              // after java 7
            System.out.println(e);                                 //catch(ArithmeticException  | ArrayIndexOutOfBoundsException e)
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
