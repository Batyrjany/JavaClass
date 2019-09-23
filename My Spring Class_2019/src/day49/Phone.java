package day49;

public class Phone extends Device {

	String brand;
	int screenSize;
	
	public Phone(String brand, int screenSize, int serialNum) {
		//super();
		
		//this.serialNum=serialNum;
		super(serialNum);
		this.brand = brand;
		this.screenSize = screenSize;
	}
	
	
	public Phone() {
		
		
		
		
		//super();
		// Device(); BAD
		 //super(100);
		
	System.out.println("Phone Constructor");
	}
	
	public static void main(String[] args) {
		
		Phone p = new Phone("iPhone", 7, 123);
		
	   System.out.println(p.brand);
	   System.out.println(p.screenSize);
	   System.out.println(p.serialNum);

	}
}
