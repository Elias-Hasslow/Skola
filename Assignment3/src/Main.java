
public class Main {

	public static void main(String[] args) {

		PersonRegister reg = new PersonRegister();

		Person p1 = new Person();
		p1.setName("Elias");
		p1.setAge(21);
		p1.setIdentificationNumber("P1");
		reg.addPerson(p1);
		BankAccount account11 = new BankAccount();
		account11.setAccountNumber("P11");
		account11.setBalance(10000);

		BankAccount account12 = new BankAccount();
		account12.setAccountNumber("P12");
		account12.setBalance(5000);
		BankAccount account13 = new BankAccount();

		BankAccount account14 = new BankAccount();


		Person p2 = new Person();
		p2.setName("Victor");
		p2.setAge(21);
		p2.setIdentificationNumber("P2");
		reg.addPerson(p2);
		BankAccount account21 = new BankAccount();
		account21.setAccountNumber("P21");
		account21.setBalance(12500);

		BankAccount account22 = new BankAccount();
		account22.setAccountNumber("P22");
		account22.setBalance(7500);

		p1.addAccount(account11);
		p1.addAccount(account12);
		p1.addAccount(account13);
		p1.addAccount(account14);

		p2.addAccount(account21);
		p2.addAccount(account22);

		account11.getAccountNumber();
		
		reg.findAccount("P11").deposit(5000);

		if(p1.getAccounts().size() == 4) {
			System.out.println("True");
		}

	}

}
