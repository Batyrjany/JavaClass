package Mentoring1;

public class Student extends Person{

//	String name;
//	String lastname;
	 int id;
	public Student() {
		
		super();
		
		System.out.println("NO arg constructer of a student...");
	}

	
@Override	
public void run() {
		
	super.run();
	
		System.out.println("Student is running...");
		
	}
	
public static void main(String[] args) {
	
	
	
	Student s = new Student() ;
	
	s.run();
	System.out.println(s.name="Myensulu");
}	


}
