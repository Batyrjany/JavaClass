package Mentoring1;

public class Manager extends Employee {

	
//	private String name;
//	private String lastname;
//	private int id;
	int responsible;
	
	
	public Manager(String name, String lastname, int id,int responsible) {
		super(name, lastname, id);
		this.responsible=responsible;
	
	}
public void increaseWage(int amount) {
	
System.out.println(getName()+"increases all sallaries by "+ amount+"usd");
}
@Override	
public void showInfo() {
	super.showInfo();
	System.out.println("The amount of the people the admin is responsible for is: "+ responsible);
	
}
}
