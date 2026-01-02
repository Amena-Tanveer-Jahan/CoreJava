package com.techouts.cj3;

public class DoWhile{
    public static void main(String[] args) {
        int attempts = 0;

        do {
            attempts++;
            System.out.println("Attempt #" + attempts);
        } while (attempts < 3);

        int x = -1;
        do {
            System.out.println("Runs at least once; x=" + x);
            x--;
        } while (x > 0);
    }
}
