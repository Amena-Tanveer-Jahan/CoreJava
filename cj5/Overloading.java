package cj5;

public class Overloading {
    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }

        String add(String a, String b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2.5, 3.5));
        System.out.println(calc.add("Hello ", "Java"));
    }
}

