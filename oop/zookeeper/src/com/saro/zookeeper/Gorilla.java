package com.saro.zookeeper;

public class Gorilla extends Mammal {



	// Constructor 
	public Gorilla() {
		super(100);
	}

	
	// METHODS
	public void throwSomething() {
		this.energyLevels = this.energyLevels - 5;
		System.out.println("The gorilla is throwing something.");	
	}
	
	public void eatBananas() {
		this.energyLevels += 10;
		System.out.println("The gorilla is eating a banana.");
	}
	
	public void climb() {
		this.energyLevels -= 10;
		System.out.println("The gorilla is climbing.");
	}
}
