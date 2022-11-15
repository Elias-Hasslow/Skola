package assigment1;
import java.util.Scanner;

public class main {

	public static void main(String[] args){

				
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter employee name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter " + name + "'s hourly rate:");
		int hourlyRate = scanner.nextInt();

		System.out.println("Enter the amount of hours " + name + " has worked:");
		int hours = scanner.nextInt();
		
		PaymentSlip p1 = new PaymentSlip(name, hourlyRate, hours);		
		
		System.out.println("------------------------------------------------------------   \n"
				+ "## PAYMENT INFORMATION ##  \n"
				+ "Name: \t\t\t" + p1.getName() + "\n"
				+ "Hourly rate: \t\t$" + p1.getHourlyRate() + "\n"
				+ "Hours worked: \t\t" + p1.getHours() + "\n\n"
				+ "Salary before tax: \t$" + p1.calculateSalary() + "\n"
				+ "Salary after tax: \t$" + p1.calculateNetSalary() + "\n\n"
				+ "If you have any questions regarding your salary contact Bob \n"
				+ "------------------------------------------------------------   ");	
	}
}
