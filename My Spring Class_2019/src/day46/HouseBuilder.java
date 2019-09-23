package day46;

import java.util.ArrayList;

public class HouseBuilder {

	public static void main(String[] args) {
		

		CyberHouse h1= new CyberHouse(1,"Victorian");
		CyberHouse h2= new CyberHouse(2,"Spanish");

		
		
		CyberHouse.neighbouroodName = "Cybertek Corner";
	
	System.out.println(h1.houseNumber);
	System.out.println(h2.houseNumber);
	h1.houseNumber=100;
	System.out.println(h2.houseNumber);

	System.out.println("-------");
	
	System.out.println(h1.neighbouroodName);
	
	System.out.println(h2.neighbouroodName);

	h1.neighbouroodName="Cybertek Tower";
	System.out.println(h2.neighbouroodName);

	
	
	}

}
