package cj6;

public class FinallyStop {

    public static void main(String[] args) {

        try {
            int num1=10;
            int num2=0;
            System.out.println(num1/num2);
            System.out.println("Inside try: doing work...");
            Runtime.getRuntime().halt(0); // Forceful termination


        } catch (ArithmeticException e){
            System.out.println(e);
           return; // Forceful termination

        }
        finally {

                System.out.println("Finally: this will NOT be printed.");

        }
    }
}

