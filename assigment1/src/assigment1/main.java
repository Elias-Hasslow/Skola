package assigment1;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		
		PaymentSlip p1 = new PaymentSlip();
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter employee name:");
		String name = scanner.nextLine();
		p1.setName(name);
		
		System.out.println("Enter " + name + "'s hourly rate:");
		int hourlyRate = scanner.nextInt();
		p1.setHourlyRate(hourlyRate);

		System.out.println("Enter the amount of hours " + name + " has worked:");
		int hours = scanner.nextInt();
		p1.setHours(hours);
		
		int salary = p1.calculateSalary();
		double salaryAfterTax = p1.calculateNetSalary();
		
		System.out.println("------------------------------------------------------------   \n"
				+ "## PAYMENT INFORMATION ##  \n"
				+ "Name: \t\t\t" + name + "\n"
				+ "Hourly rate: \t\t$" + hourlyRate + "\n"
				+ "Hours worked: \t\t" + hours + "\n\n"
				+ "Salary before tax: \t$" + salary + "\n"
				+ "Salary after tax: \t$" + salaryAfterTax + "\n\n"
				+ "If you have any questions regarding your salary contact Bob \n"
				+ "------------------------------------------------------------   ");
	}

}
