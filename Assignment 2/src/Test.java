import java.util.Scanner;
import java.util.HashMap;

public class Test {
	



	public static void main(String[] args) {

		Scanner scannerInt = new Scanner(System.in);
		Scanner scannerString = new Scanner(System.in);

		Passenger[] passenger = { new Passenger(), new Passenger(), new Passenger(), // 3 [2]
				new Passenger(), new Passenger(), new Passenger(), new Passenger(), new Passenger(), new Passenger(),
				new Passenger(), new Passenger(), new Passenger() };

		HashMap<Passenger, Integer> manifest = new HashMap<Passenger, Integer>();
		manifest.put(passenger[0], 1);
		manifest.put(passenger[1], 2);
		manifest.put(passenger[2], 3);
		manifest.put(passenger[3], 4);
		manifest.put(passenger[4], 5);
		manifest.put(passenger[5], 6);
		manifest.put(passenger[6], 7);
		manifest.put(passenger[7], 8);
		manifest.put(passenger[8], 9);
		manifest.put(passenger[9], 10);
		manifest.put(passenger[10], 11);
		manifest.put(passenger[11], 12);

		// Switch seats med hjälp utav en tmpPassenger, kolla test.class i exercise 4.2
		int i = 0;
		for (int a = 0; a <= 100; a++) {
			System.out.println("Press the number for the feature you want to use:\n" + "1. Insert passenger \n"
					+ "2. Remove passenger \n" + "3. Switch seats \n" + "4. Count passengers \n"
					+ "5. Print passenger manifest");
			int input = scannerInt.nextInt();
			if (input == 1) {
				System.out.println("Please enter your name: ");
				String name = scannerString.next();
				passenger[i].setName(name);

				System.out.println("Please enter your age: ");
				int age = scannerInt.nextInt();
				passenger[i].setAge(age);

				System.out.println("Your seatnumber is: " + manifest.get(passenger[i]));
				i++;
			} else if (input == 2) {
				System.out.println("Enter the persons seatnumber you would like to remove: ");
				int seatNumber = scannerInt.nextInt();
				passenger[seatNumber].setName(null);
				passenger[seatNumber].setAge(null);
				System.out.println(passenger[seatNumber]);
				i = seatNumber - 1;
			}
			
			else if (input == 3) {
				System.out.println("Enter the seatnumber of the first passenger: ");
				Integer p1 = scannerInt.nextInt();
				System.out.println("Enter the seatnumber of the second passneger: ");
				Integer p2 = scannerInt.nextInt();
				Integer tmp  = p1;
				Passenger tmpPassenger = new Passenger(passenger[p2 -1].getName(), passenger[p2 - 1].getAge());
				passenger[p2 - 1].setName(passenger[p1 - 1].getName());
				passenger[p2 - 1].setAge(passenger[p1 - 1].getAge());
				passenger[p1 - 1].setName(tmpPassenger.getName());
				passenger[p1 - 1].setAge(tmpPassenger.getAge());


			}
			else if (input == 4) {

			}
			
			else if (input == 5) {
				System.out.println("##### PASSENGER MANIFEST ###### \nSkyBox Ltd. \nSeat \tName \t\tAge \n"
						+ manifest.get(passenger[0]) + " \t " + passenger[0].getName() + " \t\t" + passenger[0].getAge() + " \n"
						+ manifest.get(passenger[1]) + " \t " + passenger[1].getName() + " \t\t" + passenger[1].getAge() + " \n");
//						+ "3 \t " + passenger[2].getName() + " \t" + passenger[2].getAge() + " \n"
//						+ "4 \t " + passenger[3].getName() + " \t" + passenger[3].getAge() + " \n"
//						+ "5 \t " + passenger[4].getName() + " \t" + passenger[4].getAge() + " \n"
//						+ "6 \t " + passenger[5].getName() + " \t" + passenger[5].getAge() + " \n"
//						+ "7 \t " + passenger[6].getName() + " \t" + passenger[6].getAge() + " \n"
//						+ "8 \t " + passenger[7].getName() + " \t" + passenger[7].getAge() + " \n"
//						+ "9 \t " + passenger[8].getName() + " \t" + passenger[8].getAge() + " \n"
//						+ "10 \t " + passenger[9].getName() + " \t" + passenger[9].getAge() + " \n"
//						+ "11 \t " + passenger[10].getName() + " \t" + passenger[10].getAge() + " \n"
//						+ "12 \t " + passenger[11].getName() + " \t" + passenger[11].getAge() + " \n");
				System.out.println("Would you like to retun to the menu? if yes enter 1, if no enter 2");
				int input5 = scannerInt.nextInt();
				if(input5 == 1) {
					
				}
				else{
					break;
				}
			}

		}
	}
	// }

	// System.out.println(manifest.get(passenger[0]));

//	public static void addPassenger() {
//		Scanner scan = new Scanner(System.in);
//		for (int i = 0; i <= 11; i++) {
//			System.out.println("Please enter your name: ");
//			String name = scan.next();
//			System.out.println("Please enter your age: ");
//			int age = scan.nextInt();
//			passenger[i].setName(name);
//		}
//	}

	public static void switchSeat() {

	}
}
