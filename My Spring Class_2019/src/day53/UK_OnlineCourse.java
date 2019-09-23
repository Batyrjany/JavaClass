package day53;

public class UK_OnlineCourse  extends OnlineCourse{

	 int capacity = 200; 
	  public static void main(String[] args) {  
	    /*
	     * Course > OnlineCourse > UK_OnlineCourse
	     * */  
	    
	    UK_OnlineCourse sdet = new UK_OnlineCourse(); 
	    //System.out.println( sdet.capacity);
	    sdet.showCapacity();  
	    
	  }
	  
	  @Override
	  public void showCapacity() {
	    
	    // AS LONG AS YOU HAVE A FIELD CALLED capacity in this class 
	    // below line will always be interpreted as this.capacity
	    System.out.println("capacity directly " + capacity);
	    System.out.println( "UK_OnlineCourse " +  this.capacity );
	    System.out.println( "OnlineCourse " +  super.capacity);
	    
	    System.out.println("-----------------");
	    // how to print out Course capacity field 
	    
	    super.showCapacity();
	    
	  }
	  
	  
	}

