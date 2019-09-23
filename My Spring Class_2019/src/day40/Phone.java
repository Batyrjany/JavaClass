package day40;

public class Phone {

	
	  // these instance variales 
	  // can be accessed 
	  // inside instand methods directly 
	  // just like it's a local variable 
	  // for that method 
	  
	  // if you are outside class
	  // you need an object to access 
	  /// these attributes 
	
	String type;
	String OS;
	int capacity;
	
	
		public void ring() {
			System.out.println("ringing...");
		}
		
		public void dial(long num) {
			System.out.println("dialing "+ num);
		}
		
		public void displayType() {
			
			System.out.println("Type: "+ type);
	
		}

public static void main(String[] args) {
	

	// it's highly not recommended to have main method directly 
		// inside your template class-->> use different class to create an object
		
		

	Phone p = new Phone();
	p.type = "iPhone";
	p.OS = "IOS";
	p.capacity = 16;

	p.ring();
	
	p.dial(3476365229L);
	
	p.displayType();
	
	System.out.println(p.OS);
	
	System.out.println(p.capacity);
	
	System.out.println();
	
	Phone p1 = new Phone();
	p1.type = "Samsung";
	p1.OS = "Android";
	p1.capacity = 32;
	
	p1.ring();
	p1.dial(3476365229L);
	
	p1.displayType();
	
	System.out.println(p1.capacity);
	System.out.println();
	
	Phone p2 = new Phone();
	p2.type = "Pixels";
	p2.OS = "Google OS";
	p2.capacity = 116;
	p2.ring();
	p2.dial(3476365229L);
	
	
	p2.displayType();
	System.out.println(p2.type);
	System.out.println(p2.capacity);
	System.out.println();
	
	
}
	
}
