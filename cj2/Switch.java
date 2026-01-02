package cj2;

public class Switch{
    public static void main(String[] args) {
        int din= 5;
        switch (din) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        int day = 3;
       //java 14 become standard but can use n any
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        String grade = "B";
        // Enhanced switch expression  java 17 or 14
        int points = switch (grade) {
            case "A" -> 10;
            case "B", "C" -> 7;
            case "D" -> 4;
            default -> 0;
        };
        System.out.println("Points for grade " + grade + ": " + points);
    }
}

