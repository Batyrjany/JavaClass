package day53;

public class TropicalFruit extends Fruit {

	
	
	public static void main(String[] args) {
		
		
		generateJuice();
		Fruit.generateJuice();
		TropicalFruit.generateJuice();
	}
	

	
	public static void generateJuice() {
		
		System.out.println("generate TropicalFruit juice");
	}
	
	
}


///----------------- different class---------


class Fruit{
	
	public static void generateJuice() {
		
		System.out.println("generate general juice");
	}
	
	
}