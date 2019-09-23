package day48;

//import day49.Animal;

/*
 * if we are in the same package and different class
 * protected and default are accessible
 * 
 * 
 * if different package so the class is also different
 * 
 * protected and public are accessible
 * 
 */


public class Outsider extends Animal{

	public static void main(String[] args) {
		
Outsider o = new Outsider();
		//Animal a = new Animal();
		
		
		//System.out.println(o.breed);
		System.out.println(o.color);
		System.out.println(o.wild);
		System.out.println(o.legcount);
		

	}

}
