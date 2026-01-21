package com.techouts.assessment3;

@FunctionalInterface
interface Calculator{
    int operations(int num1,int num2);
}

public class _2CustomInterface {
    static void main() {
        Calculator add  =(a,b) -> a+b;
        System.out.println(add.operations(5,3));
    }
}
