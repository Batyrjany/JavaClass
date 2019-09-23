package day43;

public class Vehicle {

	 // <this> keyword can be used to address 
	  // the current object|instance being worked on 

	  
	  private String make;
	  private int speed;
	  private String model;

	  public void increaseSpeed(int increaseBy) {

	    // speed = speed + increaseBy;
	    for (int i = 1; i <= increaseBy; i++) {

	      speed++ ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	  }
	  
	  public void decreaseSpeed(int decreaseBy) {
	    
	    for (int i = 1; i <= decreaseBy; i++) {

	      speed-- ;
	      System.out.print(speed + "->");
	    }

	    System.out.println();

	  }

	  public String getModel() {
	    return model;
	  }
	  public void setModel(String model) {
	    //model = model;
	    this.model = model ; 
	  }

	  public String getMake() {
	    return make;
	  }

	  public void setMake(String newMake) {
	    this.make = newMake;
	  }

	  public int getSpeed() {
	    return speed;  // this.speed; 
	  }

	  public void setSpeed(int speed) {
	    this.speed = speed;
	  }
	  
	  
	  public void stop() {
	    
//	    speed = 0 ;      // direct way
	    this.speed = 0 ; // using this keyword
//	    setSpeed(0);
//	    this.setSpeed(0);
	    
	    
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  

	}