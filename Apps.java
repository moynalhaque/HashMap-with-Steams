package second_java.Mont;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;

public class Apps  
{
	public static void main(String[] args) {      
		   
	    Employee employee1 = new Employee("Mehraz", "IT");
	    Employee employee2 = new Employee("James", "HR");
	    Employee employee3 = new Employee("James", "R&D");
	    Employee employee4 = new Employee("Ben", "Accounting");
	    Employee employee5 = new Employee("Joe", "Accounting");
	    Employee employee6 = new Employee("Kim", "Marketing");
	    Employee employee7 = new Employee("Tim", "HR");
	    Employee employee8 = new Employee("Jo", "HR");
	    Employee employee9 = new Employee("Rob", "IT");
	    Employee employee10 = new Employee("Jason", "IT");
    
	    HashMap<Integer,Employee> employeeMap = new HashMap<Integer,Employee>();
	    employeeMap.put(1,employee1);
	    employeeMap.put(2,employee2);
	    employeeMap.put(3,employee3);
	    employeeMap.put(4,employee4);
	    employeeMap.put(5,employee5);
	    employeeMap.put(6,employee6);
	    employeeMap.put(7,employee7);
	    employeeMap.put(8,employee8);
	    employeeMap.put(9,employee9);
	    employeeMap.put(10,employee10);
	    	    		
	    for(HashMap.Entry<Integer,Employee> entry:employeeMap.entrySet()){    
	        int key = entry.getKey();  
	        Employee e = entry.getValue();  
	        System.out.println("Employee ID : " + key + 
	        		"\nName : " + e.getName() + 
	        		"\nDepartment : " + e.getDepartment());
	    }
	    System.out.println("");
		employeeMap.entrySet().stream().forEach(e ->
		System.out.println("Key : " + e.getKey() + "\nValue :\n" + e.getValue())
		);
	}
}


   
		   
	   