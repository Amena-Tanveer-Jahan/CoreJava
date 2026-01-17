package com.techouts.assessment2.strings;

import java.util.Scanner;

public class NonRepeat {
    void nonRepeat(String str){
        for(int i=0;i<str.length();i++) {
            if(str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))){
                System.out.println("The first non repeated character is "+str.charAt(i));
                return;
            }
        }

    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str =sc.nextLine().toLowerCase();
        NonRepeat obj = new NonRepeat();
        obj.nonRepeat(str);
    }
}
