import java.util.ArrayList;
import java.util.Scanner;

// Employee.java 
public class Employee {
	
	private String name;
	private int salary;
	private ArrayList<String> email;
	
	Scanner sc = new Scanner(System.in);

	public Employee(String employeeId, int salary) {
		this.name = employeeId;
		this.salary = salary;
		email = new ArrayList<String>();
	}
	
	public void addEmail(String email) {
		this.email.add(email);
		
	}
	
	public void removeEmail(String email) {
		this.email.remove(email);
	}
	
	public String getSpecificEmail(int index) {
		return this.email.get(index);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String employeeId) {
		this.name = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}