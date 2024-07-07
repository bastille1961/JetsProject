package com.skilldistillery.jets;

public class PassengerJet extends Jet {

	public PassengerJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);

	}

	@Override
	public void fly() {
		System.out.println(this + " - Commuting with passengers.");
		System.out.println(
				"Can remain aloft for " + (getRange() / (double) getSpeed()) + " hours until fuel exhaustion.");

	}

}
