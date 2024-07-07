package com.skilldistillery.jets;

public class CargoJet extends Jet implements CargoCarrier {

	public CargoJet(String model, int speed, int range, double price) {
		super(model, speed, range, price);

	}

	@Override
	public void fly() {
		System.out
				.println(this + "Freighter Jet is flying with a full load of cargo at near max mission gross weight.");
		System.out.println("The freighter you selected can remain aloft for " + (getRange() / (double) getSpeed())
				+ "hours until fuel exhaustion.");

	}

	@Override
	public void loadCArgo() {
		System.out.println("Loading palletized and containerized cargo into " + getModel()
				+ "per weight and balance load manifest.");

	}

}
