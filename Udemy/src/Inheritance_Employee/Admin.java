package Inheritance_Employee;

public class Admin extends Employee1{

	private int responsible;
	
	
	public Admin(String name, String lastname, int id,  int responsible ) {
		super(name, lastname, id);
		this.responsible=responsible;
	}

	
    public void increaseWage(int amount) {
		System.out.println(getName()+" upgrades all sallaries by "+ amount+ " usd");
		
	}


	@Override
	public void showInfo() {
		
		super.showInfo();
		
		System.out.println("The amount of people the admin is responsible for is: "+ responsible);
	}

	}
    

