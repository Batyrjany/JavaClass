
interface I {

	
	public default  void displayI() {
		System.out.println();
	}
}
class C2{
	public   void displayC2() {
		System.out.println("C2");
	}
}
 class C1 extends C2 implements I {
	 public   void displayI() {
			System.out.println("C1");
		}

 public static void main(String[] args) {
	
	 
	 
	 
	 C2 obj1 = new C1();
   	I obj2 = new C1();
   	
	I t = (C1)obj1;
   	C1 s = (C1)obj2;
   
   	
   	t.displayI();
   	s.displayC2();
   	s.displayI();
   
   	
 	obj1.displayC2();
	 obj2.displayI();
}
 
 
 }
