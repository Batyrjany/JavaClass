package Mentoring1;

public class Developer extends Employee {

	//	private String name;
//	private String lastname;
//	private int id;
	private String language;
	
public Developer(String name, String lastname, int id, String language) {
		super(name, lastname, id);
		this.language=language;
	}

@Override	
public void showInfo() {
	super.showInfo();
	System.out.println("A developer knows " + language+" language");
}
	
	public void format(String OS) {
		
		System.out.println(getName()+" is loading "+ OS +" operation system");
	}
	
}
