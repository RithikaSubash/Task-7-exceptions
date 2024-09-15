package exception;
import java.util.ArrayList;
public class ArrayListExample {
	
	    public static void main(String[] args) {
	       
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Mango");
	        System.out.println("ArrayList before clearing: " + fruits);

	        fruits.clear();

	        System.out.println("ArrayList after clearing: " + fruits);
	    }
	}


