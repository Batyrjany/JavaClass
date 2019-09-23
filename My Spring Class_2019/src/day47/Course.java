package day47;

public class Course {

	
	public static String school;
	//System.out.println(school); will not compile statement out of any block
	public static boolean isRamadan;
	
	// static initializer block
	//IT'S used initialize the static values before
	//the type's first usage and it will run only once
	static {
		isRamadan=true;
		school= "Cybertek School";
		System.out.println("Welcome to our school"+ school);
		System.out.println("Let the journey begin");
		
		
		if(isRamadan){
			System.out.println("use Ramadan schedule");
			
		}else {
			System.out.println("use regular schedule");

		}

	
	
	
	
	
	}
	
	int courseId;
	
	

	
}
