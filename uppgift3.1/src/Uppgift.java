import java.util.Scanner;

public class Uppgift {
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int firstNumber = myScanner.nextInt();

		System.out.println("Please enter a second number:");
		int secondNumber = myScanner.nextInt();

		int result = Math.multiplyExact(firstNumber, secondNumber);
		System.out.println(firstNumber + " multiplied by " + secondNumber + " is " + result);
	}
}
