import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Scanner scannerInt = new Scanner(System.in);
		Scanner scannerString = new Scanner(System.in);
		
		Passenger p1 = new Passenger();
		
		Passenger[] passengers = {
				
		};
		
		HashMap<Passenger, Integer> manifest = new HashMap<Passenger, Integer>();
		manifest.put(p1, 1);
		
		
		//2D array med seatnumber och passenger
		
		//Switch seats med hjälp utav en tmpPassenger, kolla test.class i exercise 4.2
		

		System.out.println("Press the number for the feature you want to use:\n" + "1. Insert passenger \n"
				+ "2. Remove passenger \n" + "3. Switch seats \n" + "4. Count passengers \n"
				+ "5. Print passenger manifest");
		int input1 = scannerString.nextInt();

		if (input1 == 1) {
			System.out.println("Please enter your name:");
			String name = scannerString.next();
			passengers[2].setName(name);

			System.out.println("Please enter your age:");
			int age = scannerString.nextInt();
			passengers[2].setAge(age);
			
			

		}
	}
}
