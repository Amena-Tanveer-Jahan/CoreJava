package cj1;

public class Variables {
    int instanceVariable = 0;
    static int staticVariable= 0;

    public static void main(String[] args) {
        int localVariable = 10;
        Variables d1 = new Variables();
        Variables d2 = new Variables();
        d1.instanceVariable++;
        d2.instanceVariable += 2;
        Variables.staticVariable += 5;
        System.out.println("Local Counter     : " + localVariable);
        System.out.println("d1.instanceCounter: " + d1.instanceVariable);
        System.out.println("d2.instanceCounter: " + d2.instanceVariable);
        System.out.println("Static Counter    : " + Variables.staticVariable);
    }
}

