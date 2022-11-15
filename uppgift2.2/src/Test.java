public class Test {

	public static void main(String[] args) {

		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();

		c1.setCourseCode("SYSA 21");
		c1.setName("Introduction to Information Systems");
		c1.setCredits(30);

		c2.setCourseCode("INFC35");
		c2.setName("Decision Support Systems");
		c2.setCredits(7.5);

		c3.setCourseCode("SYSA14");
		c3.setName("IT Architecture and Software Systems");
		c3.setCredits(30);

		double totalCredits = c1.getCredits() + c2.getCredits() + c3.getCredits();
		System.out.println("The total amount of credits for all three courses are: " + totalCredits);

	}
}
