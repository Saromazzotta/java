package com.saro.zookeeper;

public class Bat extends Mammal {
//	private int energyLevel = 300; doesn't need its own attributes since it inherits from the parent class

	
	// Constructor 
	public Bat() {
		super(300);
	}
	
	// METHODS
	public void fly() {
		System.out.println("Zsshshshshhh...The bat is flying and loses 50 energy.");
		energyLevels -= 50;
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Not looking good...There goes 1 human, the bat gains 25 energy.");
		energyLevels += 25;
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("SDJCCrcrcrcrcrrkkkksshshhcjc...Burning sounds can be heard form the distance. The bat loses 100 energy.");
		energyLevels -= 100;
		displayEnergy();
	}
	
}
