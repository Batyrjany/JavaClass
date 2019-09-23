package day51;

public class Animal {

	
	public  void makeNoise() {
		
		
		System.out.println("General noise");
	}
	
public  void eat() {
		
		
		System.out.println("Eating");
	}
	
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Horse h1 = new Horse();
		Dog d1 = new Dog();
		
		
		a1.makeNoise();
		System.out.println("-----");
		h1.makeNoise();
		System.out.println("-----");
		d1.makeNoise();
		System.out.println("-----");
		
	}
	
}
