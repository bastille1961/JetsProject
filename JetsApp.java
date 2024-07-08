package com.skilldistillery.jets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JetsApp {

	// Two fields max

	private AirField airfield = new AirField();
	private Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.launchApp();
	}

	public void launchApp() {
		boolean running = true;
		while (running) {
			displayMenu();

			int choice = 0;

			try {
				choice = keyboard.nextInt();
				keyboard.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number from 1 to 9 to select menu items.");
				keyboard.nextLine();
				continue;
			}
			switch (choice) {
			case 1:
				airfield.listFleet();
				break;
			case 2:
				airfield.flyAllJets();
				break;
			case 3:
				airfield.viewFastestJet();
				break;
			case 4:
				airfield.viewJetWithLongestRange();
				break;
			case 5:
				airfield.loadAllCargoJets();
				break;
			case 6:
				airfield.dogfight();
				break;
			case 7:
				addJetToFleet();
				break;
			case 8:
				removeJetFromFleet();
				break;
			case 9:
				running = false;
				break;
			default:
				System.out.println("Invalid option. Please select number 1 through 9.");
			}
		}
	}

	private void displayMenu() {
		System.out.println("1. List fleet.");
		System.out.println("2. Fly all jets.");
		System.out.println("3. View fastest jet.");
		System.out.println("4. View jet with longest range.");
		System.out.println("5. Load all Cargo Jets.");
		System.out.println("6. Perform simulated Dogfight with vintage aircraft.");
		System.out.println("7. Add a jet to your livery.");
		System.out.println("8. Remove a jet from your livery.");
		System.out.println("9. Quit.");
		try {
			System.out.println("Enter your selection: ");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Try again by entering a number (1 - 9).");
		}
	}

	private void addJetToFleet() {
		try {
			System.out.print("Enter the model you would like to add to your livery: ");
			String model = keyboard.nextLine();
			System.out.print("Enter the maximum speed for this new model in MPH: ");
			int speed = keyboard.nextInt();
			System.out.print("Enter the max range for this new model: ");
			int range = keyboard.nextInt();
			System.out.print("Enter the acquisition price for this new model: ");
			double price = keyboard.nextDouble();
			keyboard.nextLine();

			Jet newJet = new PassengerJet(model, speed, range, price);
			airfield.addJet(newJet);
		} catch (InputMismatchException e) {
			System.out.println("Invalid Input, try again by entering a number (1 - 9).");
		}
	}

	private void removeJetFromFleet() {
		airfield.listFleet();
		System.out.print("Enter the number of the jet you want to remove from your livery: ");
		try {
			int index = keyboard.nextInt();
			keyboard.nextLine();
			airfield.removeJet(index - 1);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid number.");
		}

	}
}
