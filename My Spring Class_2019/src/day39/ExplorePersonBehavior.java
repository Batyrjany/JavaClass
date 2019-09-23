package day39;

public class ExplorePersonBehavior {

	public static void main(String[] args) {
		

		
	//	Person.eat(); //will not compile
		              //can't be called directly
		               //when it's not static in Person Class 
		
		// when it's not static we should call as below
		
		Person p = new Person ();
		
		p.age = 19;
		p.gender = 'M';
		p.name = "Night King";
		
		p.eat();
		p.tellMeYourName();
		System.out.println();
		
		
		Person p1 = new Person ();
		p1.age = 19;
		p1.gender = 'F';
		p1.name = "Alina";

		p1.eat();
		p1.tellMeYourName();
		System.out.println();
		p.printPersonInfo();
		System.out.println();
		p1.printPersonInfo();
		
	}

}
