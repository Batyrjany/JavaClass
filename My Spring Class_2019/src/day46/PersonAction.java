package day46;

public class PersonAction {

	public static void main(String[] args) {
		

		Person p1 =new Person ("Batyr",6.1f,'M');
		
		
		Person p2 =new Person ("Gozel",6.5f,'F');

		
		System.out.println(Person.race);

		System.out.println(p1.race);

	
	Person.race="Hispanic";
	System.out.println(p2.race);
	
	p2.race="American";
	System.out.println(p1.race);
	
	
	
	
	
	}

}
