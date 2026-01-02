package com.techouts.cj3;

public class While{
    public static void main(String[] args) {
        int c= 5;

        while (c > 0) {
            System.out.println("Countdown: " + c);
            c--;
        }

        // While with sentinel-style logic (no input here, just demo)
        int i = 0;
        while (i < 3) {
            System.out.println("Looping i=" + i);
            i++;
        }
    }
}
