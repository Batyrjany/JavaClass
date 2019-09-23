package Assignments;

public class replit191 {

	public String name;
	public String color;
	public int amount;
	
	
	public  String asString() {
		
	String all= "name: "+ name+" color: "+color+" amount: "+ amount;
		
		return all;
		
	}
	
	
	public static void main(String[] args) {
		
		replit191 a = new replit191();
		   a.name = "ball";
		   a.color = "red";
		   a.amount = 1;
		   
		   
		    System.out.println(a.asString());
	}
	
	
}
