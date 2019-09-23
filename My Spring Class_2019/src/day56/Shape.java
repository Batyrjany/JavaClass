package day56;

public abstract class Shape {

	
	String color;

	public Shape(String color) {
	
		this.color = color;
	}
	abstract void  calculatePerimeter();
	abstract void  calculateArea();
	
	abstract public String toString();
	

	
	
}
 
		
		
		