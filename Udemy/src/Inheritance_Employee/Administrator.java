package Inheritance_Employee;

public class Administrator extends Employee{

	private int responsibleEmployeeCount;
	
	public Administrator(String name, int salary, String department, int responsibleEmployeeCount) {
		super(name, salary, department);
         this.responsibleEmployeeCount=responsibleEmployeeCount;		

	}
	
	
	
	
	public void increaseWage(int amount) {
		
		
		System.out.println("An amount of "+amount+" has been added to the salary ");
	
		
	}

	@Override
	public void  showInfo() {
		super.showInfo();
		System.out.println("Responsible employee Count "+ this.responsibleEmployeeCount);
		
	}
	
	
	
	
	}

	
	
	