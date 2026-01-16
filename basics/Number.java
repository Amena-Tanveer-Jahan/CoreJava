package basics;

import com.sun.jdi.InvalidTypeException;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) throws InvalidTypeException {

        try( Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num<0){
                System.out.println((-num));
            } else if (num == 0) {
                System.out.println("Its zero it doesnt have positive or negative");
            } else if (num > 0) {
                System.out.println(-num);
            }else{
                System.out.println("Please enter a number");
            }

        }

    }
}
