package day58;

public class Dog  extends Animal implements IndoorPet{

	
	@Override
	public void makeNoise() {
		System.out.println("Gav.... Gav");
	}

	@Override
	  public String toString() {
	    return "DOG VERSION OF TOSTRING" ; 
	  }
	  public static void doStatic() {
	    System.out.println("Dog Static");
	  }
	  
	}

