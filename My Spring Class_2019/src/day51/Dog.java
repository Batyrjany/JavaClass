package day51;

public class Dog extends Animal{

	
	@Override
	public String toString() {
		return "Dog []";
	}

	@Override
	public void makeNoise() {
		
		System.out.println("woof");
		System.out.println("General noise");
	}
	
}
