package day41;

public class TeacerAction {

	public static void main(String[] args) {
		

		Teacher akbar = new Teacher();
		
		//fields are private we can't acces
		
		
//		System.out.println(akbar.name);
//		System.out.println(akbar.specialty);
	
//	akbar.setName("Akbar");
//	akbar.setSpecialty("magic");
	
	
	System.out.println(akbar.getName());
	System.out.println(akbar.getSpecialty());
	
	
	akbar.setName("Batyr");
	akbar.setSpecialty("real");
	
	
	System.out.println(akbar.getName());
	System.out.println(akbar.getSpecialty());
	
	
	
	}

}
