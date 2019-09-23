package Inheritance_Employee;

public class Animal {

	private String name;
	private int weight;
    private int height;
    private int legs;
	public Animal(String name, int weight, int height, int legs) {
		
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.legs = legs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWight() {
		return weight;
	}
	public void setWight(int wight) {
		this.weight = wight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public void eat() {
		System.out.println("Animal is eating...");
	}
	public void move(int speed) {
		System.out.println("Animal is moving with velocity of "+ speed+" km/h");
	}
	
	public void showInfo() {
		
		System.out.println("Name is :" +this.name+"\nWeight is : "+this.weight+"\nHeight is : "+this.height+"\nLegs : "+legs);
		
	
		
	}
}
