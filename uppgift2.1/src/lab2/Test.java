package lab2;

public class Test {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("Joe");
		p1.setAddress("Lund");
		
		p2.setName("Dan");
		p2.setAddress("Malmö");
		
		System.out.println(p1.getName() + "\n" + p2.getAddress());
				
		
	}

}
