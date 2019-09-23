package day57;

public class Burger implements Edible {

	
	@Override
	public String toString() {
		return "Burger [name=" + name + ", size=" + size + "]";
	}
	String name;
	int size;
	public Burger(String name, int size) {
		
		this.name = name;
		this.size = size;
	}
	@Override
	public void eat() {
		System.out.println("Eating a burger.....");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
