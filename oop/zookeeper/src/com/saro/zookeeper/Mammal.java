package com.saro.zookeeper;

public class Mammal {
	protected int energyLevels = 100;
	
	// CONSTRUCTOR
	public Mammal(int energyLevel) {
		this.energyLevels = energyLevel;
	}
	
	
	// METHODS
	public int displayEnergy() {
		System.out.println("Current Energy Level: " + energyLevels);
		return energyLevels;
	}


	// SETTERS AND GETTERS
//	public int getEnergyLevels() {
//		return energyLevels;
//	}
//
//
//	public void setEnergyLevels(int energyLevels) {
//		this.energyLevels = energyLevels;
//	}
//	
	
	
	
}