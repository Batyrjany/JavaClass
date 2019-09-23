package day63;

public class note63 {

	
	/*
	 * NOTE EXCEPTION 
Non-typical , exceptional condition that signal a 
Piece of code could not execute normally 
Exception handling 
Any type of action to process any kind of error
How to handle exception 
    
    we use try catch block 
    
    try{
      
      // things you want to execute 
      
    }catch (TypeOfException name){
      
      // action if exception happens
      
    }
    
    // another code 
    
    // End of program 
    
    
multi try catch block 
    
    try {
      
      //System.out.println( 6/0 ); // -->>ArithmeticException object is created 
      throw new ArithmeticException("6 divided by 0"); 
      
      //int[] arr = {1,2} ; 
      
      //System.out.println( arr[100] );
      
      
    } catch (ArithmeticException e1) {
      
      System.out.println("ArithmeticException happen");
      System.out.println( e1.getMessage()  ); // this will get the message along with the exception 
    
    } catch (ArrayIndexOutOfBoundsException e2) {
    
      System.out.println("ArrayIndexOutOfBoundsException happen");
    
    } catch (NullPointerException e3) {
      
      System.out.println("NullPointerException happen");
  
    } 
    
    
    // IF THEY HAVE PARENT CHILD RELATIONSHIP IN CATCH BLOCK EXCEPTION TYPES 
    // THE ORDER IS --->> MOST SPECIFIC TYPE FIRST THEN GENERAL TYPE LATER 
          -- CHILD FIRST , PARENT LATER 
          
    
    
    IF WE WANT TO CATCH MULTIPLE EXCEPTION TYPE IN ONE CATCH BLOCK 
     WE CAN USE | to connected them together 
     Objective is to reduce code duplication if same action happen both catch block 
     
    
    try {
      
      //System.out.println( 6/0 ); // -->>ArithmeticException object is created 
      //throw new ArithmeticException("6 divided by 0"); 
      throw new ClassCastException();
      //int[] arr = {1,2} ; 
      
      //System.out.println( arr[100] );
      
    // COMBINING MULTIPLE EXCEPTION TYPE USING | 
    // This is introduced in Java 7 
    } catch (ArithmeticException | ArrayIndexOutOfBoundsException| NullPointerException e1) {
      
      System.out.println("Target Exception happen");
      
    } catch (Exception e) {
    
      System.out.println("not target Exception happen");
    
    }
    
    
    
    
    // finally block is used to run pience of code that always run 
    no matter an exception is caught or not 
    
public class FinallyKeyword {
  public static void main(String[] args) {
    
    // HOW CAN WE MAKE SURE PROGRAM END GRACEFULLY --
    // THE EXCEPTION OBJECT MUST BE CAUGHT BY A CATCH BLOCK 
    // EVENTUALLY TO END OR CONTINUE YOUR PROGRAM GRACEFULLY
    
    // Objective:  run certain code whether the exception is caught or not 
    System.out.println("START ");
    try {  
      System.out.println("Try block ");
      // This is the only time that finally does not get to execute because JVM shutdown
      //System.exit(0);
      
      throw new RuntimeException(); 
      // UN REACHABLE CODE AND IT DOES NOT COMPILE 
      //System.out.println("BAL BLA BLA ");
      
    }catch (ArithmeticException e) {
      // ArithmeticException e = new RuntimeException();  BAD !!!!
      System.out.println( "caught" );
    
    // A CODE  run no matter we have caught the exception or not
    // FOR EXAMPLE : closing a resource after using them 
      //  closing browser whether we have exception or not
    }finally {
      System.out.println( "This code run no matter we have caught the exception or not" );
    }
  
    System.out.println("End ");
    
    
  }
}
    
    
    // CHECKED AND UNCHECKED EXCEPTIONS 
    
    CHECKED EXCEPTIONS 
       A EXCEPTION TYPE THAT MUST BE HANDLED AT COMPILE TIME 
       USUALLY CAN BE ANTICIPATED AND MUST BE HANDLED 
       
       ANYTHING THAT IS A EXCEPTION BUT NOT A RUNTIME EXCEPTION 
       
       
       
    UNCHECKED EXCEPTIONS 
       A EXCEPTION TYPE THAT CAN BE HANDLED AT RUNTIME 
       USUALLY PROGRAMMER ERROR, LOGICAL ERRORS, USER INVALID INPUTS 
    
    ANYTHING THAT IS-A RUNTIME EXCEPTION + SUB CLASS OF ERROR CLASS (should not be handled!!)
    
    
      
      
    throw keyword 
       is used to programatically throw anything that IS-A Throwable  object
       we can throw either checked or unchecked exception 
           checked exception must be handled or declared 
       
       it must be used inside a method body followed by exception object 
         throw new Exception(); 
       We can only throw one exception object 
           throw new FileNotFoundException, ArithmaticException(); BAD!@!!!!!!!
           
    throws keyword 
      is used to declare| document a method might throw exception of some kind 
         public static void doSomething throws SomeExceptionType {}
      
      we can declare both checked or unchecked exception 
        declaring the method that throw checked exception will pass the respobsibity 
        of handling exception to the caller of the method 
        
        declaring the method that throw unchecked exception will not do anything 
        calling the method will not require to handle the exception at compile time
              
      it can be only used in method signature  NOWHERE ELSE !!
      
      We can declare as many type as possible 
      
      
      // HOT INTERVIEW QUESTIONS : 
      
      HOW CAN YOU CREATE YOUR CUSTOM EXCEPTION 
      
      
      Creating a type of Unchecked Exception
      
         ANYTHING THAT IS-A RUNTIMEEXCEPTION IS UNCHECKED EXCEPTION 
         
       
        public class TooManyOfferException extends RuntimeException {
        
        }
        public class HorseTiredException extends RuntimeException {
        }
        
        public class BrainOutOfMemoryException extends RuntimeException {
        }
        
        
        Throwable  + Anything that sub class of Exception but not sub class of RuntimeException 
        is considered as Checked exception 
        
          Creating a type of checked Exception
      
         ANYTHING THAT IS-A ATypeOfCheckedException IS CHECKED EXCEPTION 
         
      
      public class NotReadForClassException extends Exception {} 
      public class MyCustomCheckedException extends InterruptedException {} 
      
      
      
      
      
      
      
      
      
      
      
    
    
    
	 * 
	 * */
	
}
