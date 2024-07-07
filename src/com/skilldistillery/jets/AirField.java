package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {

	// THIS CLASS CANNOT HAVE ANY ADDIT FIELDS

	private ArrayList<Jet> jets;

	public AirField() {
		jets = new ArrayList<>();
		initializeFleet();
		// create 5 different jet objects, add them to list
	}

	// DO NOT CREATE A getJets() method.

	private void initializeFleet() {
		jets.add(new PassengerJet("Embraer E170", 541, 2600, 46300000));
		jets.add(new CargoJet("Boeing737_200F", 514, 3000, 65000000));
		jets.add(new FighterJet("Grummnan_A6E_Intruder", 648, 1500, 43000000));
		jets.add(new CargoJet("Lockheed L-1011 TriStar", 520, 4890, 200000000));
		jets.add(new FighterJet("Cessna A-37 Dragonfly", 425, 932, 395000));
	}

	// add jet method that accepts an argument for a jet and adds it to the list
	public void addJet(Jet jet) {
		jets.add(jet);
	}

	public void removeJet(int index) {
		if (index >= 0 && index < jets.size()) {
			jets.remove(index);
		} else {
			System.out.println("Invalid index.");
		}
	}

	public void listFleet() {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
		}
	}

	public void viewFastestJet() {
		Jet fastestJet = null;
		for (Jet jet : jets) {
			if (fastestJet == null || jet.getSpeed() > fastestJet.getSpeed()) {
				fastestJet = jet;
			}
		}
		System.out.println("The fastest aircraft in your livery is: " + fastestJet);
	}

	public void viewJetWithLongestRange() {
		Jet longestRangeJet = null;
		for (Jet jet : jets) {
			if (longestRangeJet == null || jet.getRange() > longestRangeJet.getRange()) {
				longestRangeJet = jet;
			}
		}

		System.out.println("The aircraft with the longest range in your livery is: " + longestRangeJet);
	}

	public void loadAllCargoJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCArgo();

			}
		}
	}

	public void dogfight() {
		for (Jet jet : jets)
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}
	}
}
