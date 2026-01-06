package cj6;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) throws InvalidAgeException {
        int age = 19;
        if (age < 18) {
            throw new InvalidAgeException("Age should be more than or equal to 18" + age);
        } else {
            System.out.println("Valid age: "+age);
        }
    }
}