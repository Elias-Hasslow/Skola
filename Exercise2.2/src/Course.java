
public class Course {

	public String courseCode;
	public String name;
	public double credits;
	
	Course() {}
	
	Course(String newCourseCode, String newName, double newCredits) {
		courseCode = newCourseCode;
		name = newName;
		credits = newCredits;
	}
	
	public static void enroll() {
		System.out.println("You have enrolled to the course");
	}
}
