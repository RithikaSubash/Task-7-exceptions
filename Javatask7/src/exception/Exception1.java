package exception;

public class Exception1 {
	
	    public static void main(String[] args) {
	       
	        try {
	            int[] numbers = {1, 2, 3};
	            System.out.println("Accessing an invalid array index:");
	            System.out.println(numbers[3]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index is out of bounds");
	        }

	       
	        try {
	            String text = "Hello";
	            System.out.println("Accessing an invalid string index:");
	            System.out.println(text.charAt(5)); 
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println(" String index is out of bounds");
	        }
	    }
	}



