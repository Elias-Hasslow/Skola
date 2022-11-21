import java.util.Scanner;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		Scanner scannerInt = new Scanner(System.in);
		//Scanner scannerString = new Scanner(System.in);

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

		for (int z = 0; z <= 11; z++) {
			passenger[z].setName(null);
		}

		int i = 0;
		for (int a = 0; a <= 100; a++) {
			System.out.println("Press the number for the feature you want to use:\n" + "1. Insert passenger \n"
					+ "2. Remove passenger \n" + "3. Switch seats \n" + "4. Rename passenger \n"
					+ "5. Count passengers \n" + "6. Print passenger manifest");
			int input = scannerInt.nextInt();

			if (input == 1) {
				if (passenger[i].getName() == null) {
					System.out.println("Please enter your name: ");
					String name = scannerInt.next();
					passenger[i].setName(name);

					System.out.println("Please enter your age: ");
					int age = scannerInt.nextInt();
					passenger[i].setAge(age);

					System.out.println("Your seatnumber is: " + manifest.get(passenger[i]) + "\n");
					i++;
				}
//				else {
//					for (int l = 0; l <= 11; l++) {
//						if (passenger[l].getName() == null) {
//							i = l;
//							System.out.println("Please enter your name: ");
//							String name = scannerString.next();
//							passenger[i].setName(name);
//
//							System.out.println("Please enter your age: ");
//							int age = scannerInt.nextInt();
//							passenger[i].setAge(age);
//
//							System.out.println("Your seatnumber is: " + manifest.get(passenger[i]));
//							i++;
//						}
//
//					}
//				}

			} else if (input == 2) {
				System.out.println("Enter the persons seatnumber you would like to remove: ");
				int seatNumber = scannerInt.nextInt();
				passenger[seatNumber - 1].setName(null);
				System.out.println("\n");
			}

			else if (input == 3) {
				System.out.println("Enter the seatnumber of the first passenger: ");
				int p1 = scannerInt.nextInt();
				System.out.println("Enter the seatnumber of the second passneger: ");
				int p2 = scannerInt.nextInt();
				Passenger tmpPassenger = new Passenger(passenger[p2 - 1].getName(), passenger[p2 - 1].getAge());
				passenger[p2 - 1].setName(passenger[p1 - 1].getName());
				passenger[p2 - 1].setAge(passenger[p1 - 1].getAge());
				passenger[p1 - 1].setName(tmpPassenger.getName());
				passenger[p1 - 1].setAge(tmpPassenger.getAge());
				System.out.println("\n");

			}

			else if (input == 4) {
				System.out.println("Enter name of the passenger:");
				String name = scannerInt.next();
				
				System.out.println("Enter the seat of the passenger: ");
				int seat = scannerInt.nextInt();
					if(name.equals(passenger[seat - 1].getName()) && seat == manifest.get(passenger[seat - 1])) {
						System.out.println("Enter the new name:");
						String newName = scannerInt.next();
						passenger[seat - 1].setName(newName);
						System.out.println("The name has been updated to: " + passenger[seat - 1].getName() + "\n");
					}
					else {
						System.out.println("The entered name does not match with the seatnumber\n");
					}
			}
			
			else if (input == 5) {
				int amount = 0;
				for (int e = 0; e <= 11; e++) {
					if (passenger[e].getName() == null)
						;

					else {
						amount++;
					}
				}
				System.out.println("The amount of passengers on the flight is: " + amount + "\n");
			}

			else if (input == 6) {
				System.out.println("##### PASSENGER MANIFEST ###### \nSkyBox Ltd. \nSeat \tName \t\tAge");
				for (int g = 0; g <= 11; g++) {
					if (passenger[g].getName() != null) {
						System.out.println(g + 1 + "\t" + passenger[g].getName() + "\t\t" + passenger[g].getAge());
					} else {
						System.out.println(g + 1);
					}
				}

				System.out.println("Would you like to retun to the menu? if yes enter 1, if no enter 2");
				int input5 = scannerInt.nextInt();
				if (input5 == 1) {
				} else {
					break;
				}
			}

		}
	}
}
