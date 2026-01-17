package com.techouts.assessment2.arrays;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int count=0;
        System.out.println("Enter elements in the array");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            boolean flag=false;
            for (int j = 0; j < count + 1; j++) {
                if (arr2[j] == arr[i]) {
                    flag = true;
                }
            }

                if(!(flag)){
                    arr2[count] =arr[i];
                    count++;
                }
            }

        for(int i=0;i<count;i++){
            System.out.print(arr2[i] +" ");
        }
    }
}
