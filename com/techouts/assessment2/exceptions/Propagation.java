package com.techouts.assessment2.exceptions;

public class Propagation {
    static void sum(int num1,int num2){
        int sum = num1+ num2;
        System.out.println(sum);
        Propagation.division(20,0);
    }
    static void division(int num1,int num2){
        int div=num1/num2;
        System.out.println(div);
    }
    public static void main(String[] args){
        //Propagation.sum(10,20);
         try{
            Propagation.sum(10,20);
         }catch (ArithmeticException e){
              System.err.println(e.getMessage() +" exception");
          }
    }
}
