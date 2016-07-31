package project;

import java.util.Scanner;

public class Menu {

	// Menu option methods
	public static void fastestJet(Jet[] jets) {
		Jet fastestjet = new Jet();
		for (Jet jet : jets) {
			if (jet.getSpeed() > fastestjet.getSpeed()){
				fastestjet = jet;
			}
		}
		System.out.println("\nThe fastest jet in our fleet is: ");
		fastestjet.specs();
	}
	public static void longestRange(Jet[] jets) {
		Jet fastestjet = new Jet();
		for (Jet jet : jets) {
			if (jet.getRange() > fastestjet.getRange()){
				fastestjet = jet;
			}
		}
		System.out.println("\nThe jet in our fleet with the longest range is: ");
		fastestjet.specs();
	}
	
		
	public static Jet[] addJet(Jet[] jets, Jet newJet) {
		
		// make new array
		Jet[] newArray = new Jet[jets.length + 1];
		
		// add old objects to new array 
		for(int i = 0; i < newArray.length - 1; i++ ) {
			newArray[i] = jets[i];
			//jets[i] = newArray[i];
		}
		// add the new jet to the end of the old array
		newArray[newArray.length - 1] = newJet;
			
		return newArray;
	}
	
	
	
	
	
	// Menu Graphic
	public void displayMenu() {
		System.out.println(" _____________________________________________ ");
		System.out.println("|                                             |");
		System.out.println("|            Gaston's Fleet Inc.©             |");
		System.out.println("|            --------------------             |");
		System.out.println("|                                             |");
		System.out.println("| Options: [1]: List Fleet                    |");
		System.out.println("|          [2]: View Fastest Jet              |");
		System.out.println("|          [3]: View Jet with Longest Range   |");
		System.out.println("|          [4]: Add to the Fleet              |");
		System.out.println("|          [5]: Quit                          |");
		System.out.println("|_____________________________________________|");

	}
	
	
}
