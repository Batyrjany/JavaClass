package day32;

public class task1 {

	public static void main(String[] args) {
		

		

		

	     System.out.println(   salary()    );
	     System.out.println(   task1.salary() *2   );
//	     long mySalary = salary();
//	     System.out.println(mySalary*2);
//	     
	   long firstYearSalary =salary();
	   long secondYearSlary = (long) (firstYearSalary*1.1);
	     System.out.println(firstYearSalary+secondYearSlary);
	 
	     System.out.println();
	     
	     
	     boolean result = isAdultOrNot(19);
	 
	     System.out.println(result);
	     
	     System.out.println(isAdultOrNot(23));

	 System.out.println(isAdultOrNot(18));

	 System.out.println(isAdultOrNot(15));
	 
	}
	  
	  
	  
	  public static long salary() {
		  
		  return 150000;
		  
		  
		  
		  
	  }

	  public static boolean isAdultOrNot(int age) {

		  
		//  if (age>18) {
//			  return true;
//		  }else {
//			  return false;
//		  }
    
		  return age>18;
		  
		  
	  }
	  
	  
	}

