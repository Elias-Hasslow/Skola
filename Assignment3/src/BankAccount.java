
public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	public void withdraw(double amount) {

		if (amount <= 0.5 * balance && balance > 0) {
			balance -= amount;
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
