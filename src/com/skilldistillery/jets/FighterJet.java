package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		System.out.println(
				this + " - Is flying on a simulated combat mission representing sub-sonic aircraft from yesteryear.");
		System.out.println("Can remain aloft for " + (getRange() / (double) getSpeed()) + "hours until fuel exhaustion.");

	}

	@Override
	public void fight() {
		System.out.println("Engaging in simulated combat with " + getModel());

	}

}
