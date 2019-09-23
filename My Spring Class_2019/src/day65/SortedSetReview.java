package day65;

	import java.util.*;
	
	public class SortedSetReview{
	

	 
	public static void main(String[] args) {
		
	
	    
	    
	    //Comparator<String> revStrCom = Collections.reverseOrder();  
	    Comparator<String> revStrCom = Comparator.reverseOrder();  
	    
	    
	    SortedSet<String> sSet = new TreeSet<>( revStrCom ); 
	    
	    sSet.add("Uulkan"); 
	    sSet.add("Secil"); 
	    sSet.add("Mavlida"); 
	    sSet.add("Uulkan");
	    sSet.add("Emine");
	    sSet.add("Emine");
	    sSet.add("Emine");
	    
	    System.out.println(  sSet );
	    sSet.forEach( each -> System.out.println(each)  );
	}
	}
	
	    
	    
	    
	    
	    