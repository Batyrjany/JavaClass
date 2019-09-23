package Mentoring1;

public class Employee {

	private String name;
	private String lastname;
	private int id;
	
	
	public Employee(String name, String lastname, int id) {
	
		this.name = name;
		this.lastname = lastname;
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public void showInfo() {
		
		System.out.println("Name: "+name);
		System.out.println("Lastname: "+lastname);
		System.out.println("ID: "+id);
		
	}
	
}
