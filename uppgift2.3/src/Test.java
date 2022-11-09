
public class Test {

	public static void main(String[] args) {

		Person p1 = new Person("John", "Smith", "Revingegatan");
		Person p2 = new Person("Mary", "Jonsson", "Flormansgatan");
		Person.marryPersons(p1, p2, null);
		System.out.println("Congratulations to " + p1.getFirstName() + " " + p1.getLastName() + " and "
				+ p2.getFirstName() + " " + p2.getLastName() + "!");
	}
  
}


