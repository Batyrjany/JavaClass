package day53;

public class OnlineCourse extends Course{

	
	
	 int capacity = 300; 
	  
	  public void showCapacity() {
	    
	    // AS LONG AS YOU HAVE A FIELD CALLED capacity in this class 
	    // below line will always be interpreted as this.capacity
	    System.out.println("capacity directly " + capacity);
	    System.out.println( "Online Course " +  this.capacity );
	    System.out.println( "Course " +  super.capacity);
	    
	  }
	  
	}


