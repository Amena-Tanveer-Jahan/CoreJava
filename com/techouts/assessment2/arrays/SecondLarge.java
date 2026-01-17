package com.techouts.assessment2.arrays;

import java.util.Scanner;

public class SecondLarge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       int max=arr[0];
        int max2=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max ){
                max2 = max;
                max=arr[i];
            } else if (arr[i]>max2 && arr[i]!= max) {
                max2=arr[i];
            }

        }
        System.out.println("Second largest element is: "+max2);
    }
}
