package day64;

import java.util.*;

public class SetIntro {

  public static void main(String[] args) {
    
    // Set interface 
      // -- define a data structure of unique element
    
    // It does not have concept of index 
    // it does not maintain insertion order 
    // HashSet  class 
    
    //HashSet<String> myStates2 = new HashSet<>();
    
    Set<String> myStates = new HashSet<>();
    myStates.add("VA") ; 
    myStates.add("TX") ; 
    myStates.add("VA") ; // this doesn't do anything
    myStates.add("PA") ; 
    myStates.add("CA") ; 
    myStates.add("VA") ;  // this doesn't do anything
    myStates.add("VA") ;  // this doesn't do anything
    myStates.add("VA") ;  // this doesn't do anything
    
    System.out.println(  myStates );
    System.out.println("size is : "+ myStates.size() );
    
    // REMOVING ITEM : WE HAVE ONLY ONE OPTION 
    // REMOVE BY OBJECT ITSELF 
    myStates.remove("PA") ; 
    // check whether we have a item 
    System.out.println( "PA EXISTS " + myStates.contains("PA")  );
    
    
    for (String state : myStates) {
      
      System.out.println("my state is : " + state);
      
    }
    
    
    
//    // what if we want to copy these unique value 
//    // somewhere else where we can use index 
//    
//    List<String> lst = new ArrayList<>(myStates) ; 
//    System.out.println(lst);
//    System.out.println(lst.get(0));
    
  
    
    
    

  }

}
