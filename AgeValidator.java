package PrcaticeLabOopsClass;
 /*
3.Write a Java program to handle custom exceptions. Create a custom exception called
"InvalidAgeException" that is thrown when age is less than 18. Create a class that
takes age as input and validates it. Display appropriate error messages when the exception is
caught.
  */
import java.util.Scanner;

// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class

public class AgeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Age is valid. You are eligible!");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
    }
}