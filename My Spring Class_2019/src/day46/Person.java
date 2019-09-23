package day46;

public class Person {

	
	
	
	
	String name;
	float height;
	char gender;
	
	//private static String race = "Asian";
    static String race = "Asian";

	static int counter;
	//int counter;

	
	public Person(String name, float height, char gender) {
		
		this.name = name;
		this.height = height;
		this.gender = gender;
	
		counter++;
	
	}


	public Person() {
		
		counter++;
	}


}
