package Abstraction_computer;

public class Monitor {

	
	private String model;
	private String name;
	private int size;
	Resolution resolution;
	
	public void switchOffMonitor() {
		System.out.println("The computer is switching off...");
	}
	public void printResolution() {
		System.out.println("Monitor resolution is "+ resolution.getWidth()+"x"+resolution.getLength());
	}
	public Monitor(String model, String name,int size, Resolution resolution) {
		
		this.model = model;
		this.name = name;
		this.size =size;
		this.resolution= resolution;
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
	
	
	
	
}
