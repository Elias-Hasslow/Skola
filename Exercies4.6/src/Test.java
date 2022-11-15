
public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee("Gary Stu", 80000);
		
			e1.addEmail("gary.stu@lu.se");
			e1.addEmail("gary.stu@ics.lu.se");
			e1.addEmail("gary.stu@ehl.lu.se");
			
			String email3 = e1.getSpecificEmail(2);
			System.out.println("Email number 3: " + email3);
			
			e1.removeEmail("gary.stu@lu.se");
			String email1 = e1.getSpecificEmail(0);
			System.out.println("Email number 1, after deletion: " + email1);
			
			
	}

}
