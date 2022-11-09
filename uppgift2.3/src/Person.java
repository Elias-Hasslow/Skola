
public class Person {

	private String firstName;
	private String lastName;
	private String address;

	public Person() {

	}

	public Person(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public static void marryPersons(Person p1, Person p2, String newLastName) {
		newLastName = "Smith";
		p1.setLastName(newLastName);
		p2.setLastName(newLastName);

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

}
