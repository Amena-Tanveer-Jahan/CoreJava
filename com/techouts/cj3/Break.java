package com.techouts.cj3;
public class Break {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9};
        int target = 7;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Not found");

        outer:
        for (int r = 1; r <= 3; r++) {
            for (int c = 1; c <= 3; c++) {
                if (r == 2 && c == 2) {
                    System.out.println("Breaking outer at r=2,c=2");
                    break outer;
                }
                System.out.println("r=" + r + ", c=" + c);
            }
        }
    }
}
