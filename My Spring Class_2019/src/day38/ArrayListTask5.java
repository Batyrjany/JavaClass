package day38;

import java.util.ArrayList;

public class ArrayListTask5 {

	public static void main(String[] args) {
	    
	    ArrayList<String> lst1 = new ArrayList<>();
	    lst1.add("Superman"); 
	    lst1.add("Batman"); 
	    lst1.add("Aquaman"); 
	    
	    ArrayList<String> lst2 = new ArrayList<>();
	    lst2.add("Wonder Woman"); 
	    lst2.add("Cyborg"); 
	    lst2.add("Flash");
	    
//	    lst1.addAll(lst2) ; 
//	    System.out.println(lst2);
	    
	    lst1.addAll(2, lst2); 
	    
	    System.out.println("Justice league : " + lst1);
	    
	    
	    
	    
	    System.out.println();
	    
	    
	    
	    ArrayList<String> lst3 =new ArrayList<>( lst1);
	    
	    System.out.println(lst3);
	    
	    
	    System.out.println("---------");
	    //How to get String representation out of ArrayList object
	    
	    
	    String lst3AsString = lst3.toString();
	    
	    
	    System.out.println(lst3AsString);
	
	    // whenever you print out a reference variable 
	    // that point to an obejct , 
	    // it will automatically call toString() method implicitly 
	    System.out.println(  lst1 );
	    System.out.println(  lst1.toString() );
	    
	    
	    
	    
	    
	  }
	}


