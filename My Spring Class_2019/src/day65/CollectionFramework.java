package day65;

import java.util.*;

public class CollectionFramework {

	public static void main(String[] args) {
	    
	    // GIVEN 
	    String str = "ABCABCEFGADBHYKJSGD"; 
	    // Find Out how many unique character 
	    
//	    // HINT : 
	//    
//	    // Convert this to an array 
//	     //char[] arr = str.toCharArray(); 
//	     String[] strArr = str.split(""); 
	//    
//	    // store it in List 
//	    List<String> lst = Arrays.asList(strArr ) ; 
//	     System.out.println(  lst);
//	     
//	    // use one of data structure that store unique element 
//	    Set<String> charSet = new HashSet<>( lst );
	//    
//	    System.out.println(charSet);
//	    System.out.println(charSet.size());
	//    
	    
	    Set<Character> charSet = new HashSet<>(); 
	    
	    for (int i = 0; i < str.length(); i++) {
	      //System.out.println(  str.charAt(i)  );
	      charSet.add( str.charAt(i) ) ; 
	    }
	    System.out.println(  charSet);
	}
}
	    
	    
	    
	    
	 