import java.util.ArrayList;

public class Person {
	private String identificationNumber;
	private String name;
	private int age;
	private ArrayList<BankAccount> personAccounts = new ArrayList<BankAccount>();

	
	public void addAccount(BankAccount account) {
//		if (Person person person.getAge() < 18) {
//			System.out.println("You need to be 18 or older to create an account.");
//		}
		this.personAccounts.add(account);
	}
	
	
	public BankAccount findAccount(String accountNumber) {
		for(BankAccount account : personAccounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}
	
	public double calculateTotalBalance() {
		double total = 0;
		for(BankAccount tmp : personAccounts) {
			total += tmp.getBalance();
		}
		return total;
	}
	
	
	
		
	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
