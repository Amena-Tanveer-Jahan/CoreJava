package com.techouts.assessment2.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    void isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            System.out.println("They are not Anagrams");
            return;
        }
        int count=0;
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        char[] ch3 = new char[ch1.length];
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i] == ch2[j]){
                    ch3[i] = ch1[i];
                    count++;
                }
            }
        }
        if(count==ch3.length){
            System.out.println("They are Anagrams");
        }else{
            System.out.println("They are not Anagrams");
        }
    }public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine().toLowerCase();
        Anagrams obj = new Anagrams();
        obj.isAnagram(str1, str2);
    }

}
