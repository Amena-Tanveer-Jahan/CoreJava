package cj3;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println();

        int n = 0;
        while (n++ < 6) {
            if (n == 3)
                continue;
            System.out.print(n + " ");
        }
    }
}
