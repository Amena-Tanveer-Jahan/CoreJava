package com.techouts.assessment;


public class StaticKeyword {

    static  double pi = 3.141592653589793;

    public static double circleArea(double radius) {
        return pi* radius * radius;
    }

    public static void main(String[] args) {
        double area = StaticKeyword.circleArea(2.0);
        System.out.println("Circle area : " + area);
    }
}
