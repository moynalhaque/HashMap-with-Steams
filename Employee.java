package second_java.Mont;

public class Employee {
	private String Name, Department;

	public Employee(String name, String department) {
		super();
		Name = name;
		Department = department;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", Department=" + Department + "]";
	}


	


	
}