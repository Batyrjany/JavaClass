package Assignments;

public class replit192 {

	
	public int plus(int n, int n2) {
		int p = n+n2;
		return p;	
	}
	public int minus(int n, int n2) {
		int p = n-n2;
		return p;	
	}
	public int multiply(int n, int n2) {
		int p = n*n2;
		return p;	
	}
	public int divide(int n, int n2) {
		int p = n/n2;
		return p;	
	}
	public static void main(String[] args) {
		   
		replit192 lc = new replit192();
		  System.out.println("1+1 = "+lc.plus(1,1)); 
		  System.out.println("2-3 = "+lc.minus(2,3));
		  System.out.println("2x3 = "+lc.multiply(2,3));
		  System.out.println("10:2 = "+lc.divide(10,2));
		  
	
}
}