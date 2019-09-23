package day53;



public class EBook extends Book{

	
	// ------ SUB CLASS CAN HIDE SUPER CLASS' FIELD BY DECLARING IT
	// ------THE ONLY THING MATTERS IS THE <NAME>  !!!!
	float name = 12.11f;
	long page=100;
	private static double weight=-1;
	
	
	
public static void main(String[] args) {
	
	
	EBook e = new EBook();
	
	System.out.println(e.name);
	
	System.out.println("-----");
	e.showValues();

}

public void showValues() {
	
	
	
	System.out.println(super.name+" -------- "+this.name);
	System.out.println(super.page+" -------- "+this.page);
	// static field can be accessed directly in instance method
	// or we can make it obvious to call in static way like  EBook.weight
	System.out.println(super.weight+" -------- "+weight);
	
}


	
}
// ------- we can have more than one class in one sourse code
// however only one should be public



class Book{
	
	String name="Bookname";
	int page = 10;
	static double weight=5.0;
	
	
	
}