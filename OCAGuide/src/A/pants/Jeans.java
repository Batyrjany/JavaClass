package A.pants;

import A.Shirt;

//import A;


public class Jeans {
	
	public void matchShirt() {
		String color= Shirt.getColor();
		
		
		if(color.equals("Green")) {
			System.out.println("Fit");
		}else {
			System.out.println("match again");
		}
	}

	public static void main(String[] args) {
		Jeans j = new Jeans();
		j.matchShirt();
	}
	
	
}
