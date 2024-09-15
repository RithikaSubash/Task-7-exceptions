package exception;
import java.util.ArrayList;
import java.util.List;
public class ListToArray {
	
	    public static void main(String[] args) {
	        List<String> fruitList = new ArrayList<>();
	        fruitList.add("Apple");
	        fruitList.add("Banana");
	        fruitList.add("Orange");
	        fruitList.add("Mango");

	        String[] fruitArray = fruitList.toArray(new String[0]);

	        System.out.println("Array elements:");
	        for (String fruit : fruitArray) {
	            System.out.println(fruit);
	        }
	    }
	}



