package day48;

//import day49.Animal; // if the class animal is in the package other than current
// and it will not compile if the calsses are in the different packages
public class Horse extends Animal{

	

	/* String color;
	 *boolean wild;
	 * int legcount;
	 *
     * the inheritance should be invisible and should in the same class
	 * 
	 * Protected access modifier enables subclass access protected members
	 * 
	 */
	int shoesCount;
	int horsePower;
	
	public static void main(String[] args) {
		
		
//	
		
		Horse h1 = new Horse();
		h1.breed ="spartan";
		h1.wild = false;
		h1.horsePower = 600;
		
		
		System.out.println(h1.breed);
		System.out.println(h1.horsePower);

		
		
		
		//	Animal a1= new Animal();
//		a1.wild= false;
//		
//		
//		System.out.println(a1.breed);
//		System.out.println(a1.color);
//		System.out.println(a1.legcount);
//		System.out.println(a1.wild);
//		
//		System.out.println("-------");
		
	}
	
	
	
}
