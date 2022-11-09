import java.util.Scanner;

public class Exercise2 {

		public static void main (String[] args) {
			
			Scanner myScanner = new Scanner(System.in);
			System.out.println("Please enter your namne:");
			
			String name = myScanner.nextLine();
			String output = "Hello " +name + " and Welscome to SYSA21, Software Development!";
			
			System.out.println(output);
			myScanner.close();
		}
}

/*
 * 1. Imports the standard Oracle class called Scanner which enables userinputs
 * 2a. Scanner is a standard Oracle class
 * 2b. An object of the Scanner class
 * 2c. New is a Java keyword which creates a Java object and allocates memory for it
 * 2d. System.in means to take and input from the keyboard
 * 3. Defines the string name as the input from the user
 * 4. It defines the string "output" as a variable that can change depending on the string name
 * 5. The code prints the string output after its been affected by the string name
 */