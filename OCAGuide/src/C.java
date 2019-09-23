

 class A{
	public void test() {
		System.out.println("A");
	}
}
 class B extends A{
	public void test() {
		System.out.println("B");
	}
}
 
 public class C extends A {

	 public void test() {
			System.out.println("C");
		}
	 
	 
	 
	 public static void main(String[] args) {
		

		 A b1 = new A();
		 A b2 = new B();
		 A b3 = new C();
	     
		// b1=b2;
		
//		 B b4 = new B();
//	     b4=(B) b2;
		
	    
		 C b5 = new C();
		 b5=(C)b3;
		
		 
		 A b6 = (C)b3;
		// A b6 = b3; // same result as far b3 is A class ref.
		 
		b1.test();
		b2.test();
		b3.test();
		System.out.println();
	 
       // b4.test();
		b5.test();
        b6.test();
		 
  
   
	    
	
	
  // A b3 = (B)b2;
	}
 }
 