import java.util.ArrayList;

public class PersonRegister {
	private ArrayList<BankAccount> totalAccounts = new ArrayList<BankAccount>();
	private ArrayList<Person> persons = new ArrayList<Person>();
	
	public void addPerson(Person person) {
		this.persons.add(person);
	}
	
	public Person findPerson(String identificationNumber) {
		for (Person person : persons) {
			if(person.getIdentificationNumber().equals(identificationNumber)) {
				return person;
			}
		}
		return null;
	}
	
	public BankAccount findAccount(String accountNumber) {
		for (BankAccount account : totalAccounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}
	
	public ArrayList<BankAccount> getTotalAccounts() {
		return totalAccounts;
	}

	public void setTotalAccounts(ArrayList<BankAccount> totalAccounts) {
		this.totalAccounts = totalAccounts;
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public double calculateTotalBalance() {
		double total = 0;
			for	(BankAccount tmp : totalAccounts) {
				 total += tmp.getBalance();
			}
			return total;
	}

}
