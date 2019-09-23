package Assignments;

public class replit202 {

	
	public double width;
	public double length;
	public double unitPrice;
	public double totalPrice;
	public boolean isPersian;
	
	public replit202() {
		
		this.width=300;
		this.length=300;
		this.totalPrice = 200;
		this.isPersian=false;
		this.unitPrice =0;
	}
	
	public replit202(double width, double length, double unitPrice,  boolean isPersian) {
	
		this.width = width;
		this.length = length;
		this.unitPrice = unitPrice;
		this.isPersian = isPersian;
		
		if(isPersian==true) {
			this.totalPrice = ((width+length)*unitPrice)+200;
		}else {
		this.totalPrice = (width+length)*unitPrice;
		}
	}


	public static void main(String[] args) {
		   
		replit202 c  = new replit202();
		replit202 c1  = new replit202(20.0,20.0,2.0,true);
		replit202 c2  = new replit202(20.0,20.0,2.0,false);

		System.out.println(c.totalPrice);
		System.out.println(c1.totalPrice);
		System.out.println(c2.totalPrice);

		    
		    

		  }
	
}
