package com.rise;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class MainIceCreamParlor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		IceCreamFactory iceCreamFactory = new IceCreamFactory();
		
		while (true) {
			System.out.println("What would you like to have Cone/Cup/Cassata: ");
			String input = scanner.nextLine();
			
			if(input.equalsIgnoreCase("q")) {
				break;
			}
			
			IceCreamCreator iceCreamCreator = iceCreamFactory.makeIceCream(input);
			
			if(iceCreamCreator != null) {
				iceCreamCreator.prepareIceCream();
				iceCreamCreator.garnishIceCream();
				System.out.println();
			}
			else {
				System.out.println("Sorry, requested ice cream is unavailable.");
			}
		}
		
		scanner.close();
	}

}
