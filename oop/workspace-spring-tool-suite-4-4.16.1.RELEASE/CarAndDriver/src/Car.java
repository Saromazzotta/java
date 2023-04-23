
public class Car {
	private int gas = 10;


	// constructor
	public Car() {
		
	}


	public void displayGas() {
		System.out.println("Fuel remaining: " + this.gas + "/10");
	}

	public void drive() {
		setGas(this.gas - 1);
		System.out.println("Driving");
		displayGas();
		
	}
	
	public void useBoosters() {
		setGas(this.gas - 3);
		System.out.println("Using boosters");
		displayGas();
	}
	
	public void refuel() {
		setGas(this.gas + 2);
		System.out.println("Refueling");
		displayGas();
	}
	
	

	
	
	
	
	
	// GETTERS AND SETTERS
	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}


}

