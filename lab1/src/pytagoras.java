import java.util.Scanner;
import java.lang.Math;

public class pytagoras {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the length of side A:");
		double sideA = scan.nextInt();
		
		System .out.println("Enter the length of side B:");
		double sideB = scan.nextInt();
		
		double sideC = Math.sqrt(Math.pow(sideB, 2) + Math.pow(sideA, 2));
		System.out.println("The length of side C is: " +sideC);
		scan.close();		
	}
}
