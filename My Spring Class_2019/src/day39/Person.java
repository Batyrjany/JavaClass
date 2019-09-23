package day39;




public class Person {

	//properties | attributes of
	//the object are defined
	//by instance variable/field
	
	
	String name;
	int age;
	char gender;
	
	 //public static void eat(){
	
	//ANY NON STATIC METHOD IS CALLED INSTANCE

	public void eat() {
		
		System.out.println("eating ");
		//System.out.println("dancing ");

	}
	public void tellMeYourName() {
		
		System.out.println("My name is "+ name );
		
	}
	
	public void printPersonInfo() {
		System.out.println("My name is "+ name +", "+"My age is "+ age+", "+"My gender is "+ gender  );

		

	}
}
