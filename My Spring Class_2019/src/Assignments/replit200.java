package Assignments;

public class replit200 {

	
	private String firstName;
	private String lastName;
	private int age;
	
	
	
	

	public replit200(String firstName, String lastName, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}




	public replit200() {
		this.firstName="undefined";
		this.lastName="undefined";
		this.age=-1;
		
	
	}




	public String toString() {
		return "replit200 [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public static void main(String[] args) {
		
		replit200 person =new replit200();
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);

		System.out.println(person.toString() );
	}

}
