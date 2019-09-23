package day45;

public class Caller {

	
	public Caller() {
		//this(100);/// this will not compile
		
System.out.println("calling no arg");	

	}
	
	public Caller(int x) {
		
		this();
		System.out.println("calling 1 arg");
		
	}
	
	
}
