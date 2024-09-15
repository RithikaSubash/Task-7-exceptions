package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	    public static void main(String[] args) {
	        
	        String fileName = "data.txt"; 

	        try {
	            
	            File file = new File(fileName);

	            Scanner fileScanner = new Scanner(file);

	            while (fileScanner.hasNextLine()) {
	                String line = fileScanner.nextLine();
	                System.out.println(line);
	            }

	            fileScanner.close(); 
	        } catch (FileNotFoundException e) {
	           
	            System.out.println("Error: The file '" + fileName + "' was not found.");
	        }
	    }
	}



