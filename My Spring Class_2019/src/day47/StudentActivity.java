package day47;



//Static Import
//it's used to import the visible static members 
//of another class
// we use keyword   >> import static  Classname.staticmember
//just like importing a class we can use 
//>>>import static  Classname.* >> to import all static members

import static day47.StudentUtility.displayAllStudent;
import static day47.StudentUtility.*;

public class StudentActivity {

	public static void main(String[] args) {

		
		
		StudentUtility.displayAllStudent();
//		System.out.println("-----");
//		//StudentUtility.displayAllStudent();
//
//        StudentUtility.addStudent ("Mergen");
//        StudentUtility.updateStudent(5, "Lale");
//        StudentUtility.removeName(0);
//       // StudentUtility.displayAllStudent();
//        StudentUtility.StudentList.clear();
//       // StudentUtility.displayAllStudent();
		
		
		
		// after static has been imported
		
		       //System.out.println(StudentList);
				addStudent ("Mergen");
				updateStudent(5, "Lale");//updating the the name at the mentioned index
				removeName(0);
			
				//StudentList.clear();
		
        
	}

}
