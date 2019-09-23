package day54;

public class SuperCar {

	
	
	final String model;
	final String make;
	Engine engine;
	public SuperCar(String model, String make, Engine engine) {
		
		this.model = model;
		this.make = make;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "SuperCar [model=" + model + ", make=" + make + ", engine=" + engine + "]";
	}
	
	public void start() {
		//this.engine.start();
		engine.start();
		System.out.println("Super Car "+make+" "+ model+" with "+ engine.cylinderCount+ " is starting...");
		
	}

	public static void main(String[] args) {
		
		
		Engine e = new Engine ("Turbo", 12);
		System.out.println(e);
		System.out.println(e.cylinderCount);
		System.out.println(e.EngineType);
        e.start();
		
		System.out.println("----------------");
		
	SuperCar s = new SuperCar("HONDA","CIVIC",e);
	System.out.println(s);
	
	
	}
}
