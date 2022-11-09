// Imports the Scanner
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args)	{
		
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("What is your first name?");

		String firstName = myScanner.nextLine();

		System.out.println("What is your last name?");
		
		String secondName = myScanner.nextLine();
		
		System.out.println("Hello " +firstName + " " +secondName);
		myScanner.close();
	}
}




