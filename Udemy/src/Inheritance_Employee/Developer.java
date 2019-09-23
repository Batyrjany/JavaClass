package Inheritance_Employee;

public class Developer extends Employee1 {

	
	private String language;
	
	public Developer(String name, String lastname, int id, String language) {
		super(name, lastname, id);
		
        this.language=language;
		
	}

	@Override
	public void showInfo() {
	
		super.showInfo();
		System.out.println("A developer knows "+ this.language+" language...");
	}

	public void format(String OS) {
		
		System.out.println(this.getName()+" is loadng "+ OS+" operation system...");
	}
	
}
