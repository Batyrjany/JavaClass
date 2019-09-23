package day65;

import java.util.*;

public class UniqueCharacters {
public static void main(String[] args) {
	// GIVEN 
    String str = "ABCABCEFGADBHYKJSGD"; 
    // Find Out how many unique character 
  
    
    // HINT : 
    
    // Convert this to an array 
    
    // store it in List 
    
    // use one of data structure that store unique element 
    
    String [] arr=str.split("");
    List<String>lst=Arrays.asList(arr);
    Set<String>st=new HashSet<>();
    for(String each:lst) {
    	st.add(each);
    }
    int length=st.size();
    System.out.println(length);
}
}