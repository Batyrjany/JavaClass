package day55;

public class SalariedEmployee extends Employee {

	
	
	int monthlySalary;

	  
	  
	  public SalariedEmployee(int id, String name,int monthlySalary) {
		  super(id,name);
		this.monthlySalary = monthlySalary;
	}



	public int getMonthlySalary() {
		return monthlySalary;
	}



	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}



	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary
				+ ", id=" + getId() + ", "
						+ "name=" + getName() + "]";
	}



	@Override
	  public void calculateAnnualSalary() {
		int annual =monthlySalary * 12 ;
	    System.out.println(annual );
	    
	  } 

	public static void main(String[] args) {
		
		SalariedEmployee e1 = new SalariedEmployee(101,"Batyr", 10000);
		System.out.println(e1);
		e1.calculateAnnualSalary();

		e1.setMonthlySalary((int) (e1.getMonthlySalary()*1.1));
		System.out.println(e1.monthlySalary);
		e1.calculateAnnualSalary();
		System.out.println("--------------------");
		
		HourlyEmployee e2 = new HourlyEmployee(123,"Gozel", 160, 80);
		System.out.println(e2);
		e2.calculateAnnualSalary();
		
	}



	@Override
	public boolean isIn100KClub() {
		
		
		int annual =monthlySalary * 12 ;

		return annual>100000;
	}
	  
	}

