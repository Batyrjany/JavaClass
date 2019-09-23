package day51;

public class Horse extends Animal{


	  // everytime horse make noise 
	  // it should make animal noise first 
	  // then it should make horse specific noise 
	  
	  @Override
	  public void makeNoise() {
	    
	    //System.out.println("General Noise");
	    System.out.println("Neigh Neigh");
	    super.makeNoise();
	    System.out.println("done neighing");
	    super.makeNoise();// we should not call it without word super because it loop infinite
	    System.out.println("now really done neighing");
	   System.out.println();
	    super.eat();// we can call another inherited method in another method like this with or without any key words such as super, this
	    eat();// we can call another inherited method in another method like this with or without any key words such as super, this
        this.eat();// we can call another inherited method in another method like this with or without any key words such as super, this

	  
	  }

	}

	
	

