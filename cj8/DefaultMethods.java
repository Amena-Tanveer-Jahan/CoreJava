package cj8;

interface Calculator {
    int operations(int num1, int num2);

    default void show() {
        System.out.println("This is default method in the interface Calculator");
    }
}

interface Calc {
    default void show() {
        System.out.println("This is default method in the Calc");
    }
}

class Demo implements Calculator, Calc {
    @Override
    public int operations(int num1, int num2) {
        Calculator add = (a, b) -> a + b;
        int adds = add.operations(num1, num2);
        System.out.println(adds);
        return adds;
    }

    @Override
    public void show() {
      /*  Calculator.super.show();
        Calc.super.show();*/
    }

    public void show1() {
        Calculator.super.show();
    }

    public void show2() {
        Calc.super.show();
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.operations(20, 30);
        //obj.show();
        obj.show1();
        obj.show2();

    }
}
