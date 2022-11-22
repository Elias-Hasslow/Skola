
public class Main {

	public static void main(String[] args) {
		
		PersonRegister reg = new PersonRegister();
		
		Person p1 = new Person();
		p1.setName("Elias");
		p1.setAge(21);
		p1.setIdentificationNumber("P1");
		reg.addPerson(p1);
		BankAccount account11 = new BankAccount("P11", 10000);
		BankAccount account12 = new BankAccount("P12", 5000);
		 
		Person p2 = new Person();
		p2.setName("Victor");
		p2.setAge(21);
		p2.setIdentificationNumber("P2");
		reg.addPerson(p2);
		BankAccount account21 = new BankAccount("P21", 10000);
		BankAccount account22 = new BankAccount("P22", 7500);
		
		p1.addAccount(account11);
		p1.addAccount(account12);
		
		p2.addAccount(account21);
		p2.addAccount(account22);
		
		p1.findAccount("P11").withdraw(10000);
		System.out.println(p1.findAccount("P11").getBalance());
		
	}

}
