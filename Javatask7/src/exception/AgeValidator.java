package exception;
import java.util.Scanner;
public class AgeValidator {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();

	           
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be 18 or older.");
	            }

	            System.out.println("Your age is valid.");
	        } catch (InvalidAgeException e) {
	           
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close(); 
	        }
	    }
	}



