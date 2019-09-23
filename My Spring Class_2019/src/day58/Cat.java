package day58;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal implements IndoorPet {

	public String color;

	public Cat(int legsCount, String color) {
		super(legsCount);
		this.color=color;
	}

	@Override
	public void makeNoise() {
	System.out.println("Miaw...");
	}

public void catleg(int count) {
	
	this.legsCount=5;
}

public Cat() {
	super();
	this.legsCount=5;
}
	
	
	
}




