package com.techouts.cj1;
public class Operators{
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        int x = 5;
        System.out.println("x++ = " + (x++));
        System.out.println("++x = " + (++x));

        System.out.println("a > b  : " + (a > b));
        System.out.println("a == b : " + (a == b));

        boolean p = true;
        boolean q = false;
        System.out.println("p && q : " + (p && q));
        System.out.println("p || q : " + (p || q));
        System.out.println("!p     : " + (!p));
        int m = 6;
        int n = 3;
        System.out.println("m & n  : " + (m & n));
        System.out.println("m | n  : " + (m | n));
        System.out.println("m ^ n  : " + (m ^ n));
        System.out.println("m << 1 : " + (m << 1));
        System.out.println("m >> 1 : " + (m >> 1));

        int max = (a > b) ? a : b;
        System.out.println("max(a,b): " + max);

        int y = 10;
        y += 5; // y = y + 5
        System.out.println("y after += 5: " + y);
    }
}

