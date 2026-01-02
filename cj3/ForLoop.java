package cj3;

public class ForLoop {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum (index for): " + sum);

        int sum2 = 0;
        for (int value : arr) {
            sum2 += value;
        }
        System.out.println("Sum (foreach)  : " + sum2);

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
