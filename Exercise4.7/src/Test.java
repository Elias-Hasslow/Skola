import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("S1", "Ken", 26);
		Student s2 = new Student("S2", "Leo", 22);
		Student s3 = new Student("S3", "Vim", 21);
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put(s1.getStudentId(), s1);
		map.put(s2.getStudentId(), s2);
		map.put(s3.getStudentId(), s3);
		
		Student the1 = map.get("S3");
		
		
		
		System.out.println(the1.getName());
		System.out.println(the1.getAge());
		System.out.println(the1.getStudentId());
	}

}
