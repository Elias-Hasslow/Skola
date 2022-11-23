import java.util.ArrayList;

public class PersonRegister {
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
		for (Person person : persons) {
			for(BankAccount bankAccount : person.getAccounts()) {
				if(bankAccount.getAccountNumber().equals(accountNumber)) {
					return bankAccount;
					}
				}
			}
		return null;
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public void setPersons(ArrayList<Person> persons) {
		this.persons = persons;
	}

	public double calculateTotalBalance() {
		double total = 0;
			for	(Person person : persons) {
				for (BankAccount bankAccount : person.getAccounts()) {
					 total += bankAccount.getBalance();
				}

			}
			return total;
	}

}
