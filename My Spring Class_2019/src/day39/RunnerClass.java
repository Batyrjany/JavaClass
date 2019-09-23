package day39;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// local variable
		// String s =abc;
		
		
		//  Creating new Person object
		Person p1 = new Person();
		
		//Setting attributes value of object
		p1.name= "Talmurat";
		p1.age = 1;
		p1.gender = 'M';
		
		
		Person p2  = new Person();
		
		p2.name= "Diana";
		p2.age=27;
		p2.gender = 'F';
		
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);
		System.out.println();
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.gender);
	}

}
