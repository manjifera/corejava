package demo;

public class Car {
	// States or properties or varialbles or has part
	String name;
	float cost;
	float milage;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car enjoy = new Car(); // <-- it created allocates space. constructor calling.
		enjoy.start();
		enjoy.accelarate();
		enjoy.stop();		
	}
	
	// Behaviour or does parts.
	void start() {
		System.out.println("Car Started!");
		
	}
	
	void accelarate() {
		System.out.println("Car Accelerated!");
		
	}
	
	void stop() {
		System.out.println("Car Stopped!");
	}
}
