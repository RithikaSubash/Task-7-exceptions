package exception;
import java.util.TreeMap;
public class EmployeeTreeMap {
	
	
	    public static void main(String[] args) {
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();

	        employeeMap.put(102, "Rithu");
	        employeeMap.put(101, "Dhachu");
	        employeeMap.put(104, "Roshu");
	        employeeMap.put(103, "Pavi");

	        System.out.println("Employee names in alphabetical order:");

	        for (String name : employeeMap.values()) {
	            System.out.println(name);
	        }
	    }
	}



