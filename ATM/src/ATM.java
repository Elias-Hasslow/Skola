import java.util.Scanner;
import java.util.InputMismatchException;

public class ATM {

	public static void main(String[] args) {

		Account account1 = new Account(5000);

		Scanner scanner = new Scanner(System.in);
		
		try {
			
		System.out.println("Welcome to the ATM! \n" + "Press 1 to check balance \n" + "Press 2 to depoist \n"
				+ "Press 3 to withdraw");
		int input1 = scanner.nextInt();

		
		
		
		if (input1 == 1) {
			System.out.println("Your balance is: " + account1.getBalance());

		}

		if (input1 == 2) {
			System.out.println("How much would you like to deposit?");
			double depositAmount = scanner.nextDouble();
			account1.setBalance(account1.getBalance() + depositAmount);
			System.out.println("Your new balance is: " + account1.getBalance());

		}

		if (input1 == 3) {
			System.out.println("How much would you like to withdraw?");
			double withdrawAmount = scanner.nextDouble();
			if (withdrawAmount > account1.getBalance()) {
				System.out.println("You can´t withdraw more than you have in your account");
			} else if (withdrawAmount <= account1.getBalance()) {
				account1.setBalance(account1.getBalance() - withdrawAmount);
				System.out.println("You have withdrawn: " + withdrawAmount + "\n" + "Your new balance is: "
						+ account1.getBalance());
			}
		}

		if (input1 != 1 && input1 != 2 && input1 != 3) {
			System.out.println("You need to enter a number between 1 and 3 in order to use the ATM");
	
			}
		}
		catch(InputMismatchException inputMismatch) {
			System.out.println("You need to enter a number, try again!");
		}
	}
	
}



