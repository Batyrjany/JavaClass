package day25;

import java.util.Arrays;

public class Task {

	public static void main(String[] args) {
		
		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 	
		
	
	for (int i = 0; i < courses.length; i++) {
	
		System.out.println(courses[i]+" course Id is "+courseId[i]);
	}
	
	
	System.out.println();
	
	//find index of Online-Java Programming
	for (int i = 0; i < courses.length; i++) {
		
		String eachCourse = courses[i];
		
		//System.out.println(eachCourse);
		if (eachCourse.equals("Online-Java Programming")) {
			
			System.out.println("index is : "+courseId[i]);
			//break;
		}
		
		
	}
	
	System.out.println();
	
	//find the course name for index 203
	
for (int i = 0; i < courses.length; i++) {
		
		int eachCourseId = courseId[i];
		
		//System.out.println(eachCourseId);
		if ( eachCourseId==203) {
			
			System.out.println("index is : "+courses[i]);
			//break;
		}
		
		
	}
	
System.out.println();


//count the courses that contains Software word


int count = 0;

for (int i = 0; i < courses.length; i++) {
	
	if(courses[i].contains("Software")) {
		count++;
		System.out.println(courses[i]);
	}
	
}
	System.out.println("Courses that contains Software: "+count);
	
	}

}
