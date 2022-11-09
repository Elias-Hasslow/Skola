
public class Main {
	
	public static void main(String[] args) {
		Course course1 = new Course("SYSA21", "Introduction to Information Systems", 30);
		Course course2 = new Course("INFC35", "Decision Support Systems", 7.5);
		Course course3 = new Course("SYSA14", "IT Architecture and Software Systems", 30);
		
		System.out.println("The total amount of credits earned for all courses: " + (course1.credits + course2.credits + course3.credits));

	}
}
