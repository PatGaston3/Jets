package project;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		// objects 
		Menu menu = new Menu();
		
		// Scanner object and input 
		Scanner keyboard = new Scanner(System.in);
		int input;
		
		// Array of jet objects 
		Jet[] jets = new Jet[6];
		
		Jet jet1 = new Jet("F-16 Fighting Falcon", "540 million", 1500, 1740, Type.MILITARY);
		Jet jet2 = new Jet("f-4 Phantom II", "470 million", 1606, 1979, Type.MILITARY);
		Jet jet3 = new Jet("Boeing 777 Freighter", "320 million", 590, 4880, Type.CARGO);
		Jet jet4 = new Jet("Boeing 747 Airliner", "270 million", 628, 7280, Type.COMMERCIAL);
		Jet jet5 = new Jet("Gulfstream G280", "24 millon", 554, 3600, Type.PRIVATE);
		Jet jet6 = new Jet("Hawker 800xp", "3.5 million", 449, 2540, Type.PRIVATE);
		
		jets[0] = jet1;
		jets[1] = jet2;
		jets[2] = jet3;
		jets[3] = jet4;
		jets[4] = jet5;
		jets[5] = jet6;
		
		
		// Start menu prompt
		while (true) {
			menu.displayMenu();
			System.out.print("Enter an option: ");
			input = keyboard.nextInt();
			
			if (input == 1) {
				System.out.println("\nHere is a list of our fleet!\n");
				for (Jet jet : jets) {
					jet.specs();
				}
			}
			if (input == 2) {
				Menu.fastestJet(jets);
			}
			if (input == 3) {
				Menu.longestRange(jets);
			}
			if (input == 4) {
				Scanner jetstuff = new Scanner(System.in);
				System.out.print("Enter new Jet name: ");
				String model = jetstuff.nextLine();
				System.out.print("Enter new Jet price: ");
				String price = jetstuff.nextLine();
				System.out.print("Enter new Jet top speed: ");
				double speed = jetstuff.nextDouble();
				System.out.print("Enter new Jet range: ");
				double range = jetstuff.nextDouble();
				System.out.print("Enter new Jet type - \n(MILITARY, COMMERCIAL, PRIVATE, CARGO) : ");
				String newtype = jetstuff.next().toUpperCase(); // enter TYPE of plane
				Type type = Type.valueOf(newtype); // pass newtype variable to Type type variable to make enum
				
				// create new jet object
				Jet added_jet = new Jet(model, price, speed, range, type);

				jets = Menu.addJet(jets, added_jet);
			}
			if (input == 5) {
				System.out.println("Thank you for choosing Gaston's Fleet Inc. ©!");
				System.out.println("Have a nice day! √");
				System.exit(0);
			}
		}
		
	}
}
