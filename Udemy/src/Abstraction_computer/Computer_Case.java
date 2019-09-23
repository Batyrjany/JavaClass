package Abstraction_computer;

public class Computer_Case {

	
	private String model;
	private String name;
	private String material;
	
	
	
	public void turnOn() {
		System.out.println("Computer is now running...");
	}
	public Computer_Case(String model, String name, String material) {
	

		this.model = model;
		this.name = name;
		this.material = material;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
}
