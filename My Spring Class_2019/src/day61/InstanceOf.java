package day61;
import day58.*;
public interface InstanceOf {

	
	public static void main(String[] args) {
		
		
		Animal a1 = getMyAnimal();
		
		
		String objTypeName = a1.getClass().getSimpleName();
		System.out.println(objTypeName);
		
	  boolean isDog = a1 instanceof Dog ; 
	  System.out.println("is pointing to type of Dog "+isDog);
		
	  boolean isCat = a1 instanceof Cat ; 
	  System.out.println("is pointing to type of Cat "+isCat);
	  
	  if(isCat) {
		  
		  Cat c1 =(Cat) a1;
		  
		  System.out.println(c1.legsCount);
	  }
	  
	  
	  
	  boolean isAnimal = a1 instanceof Animal ; 
	  System.out.println("is pointing to type of Animal "+isAnimal);
	  
	  boolean isObject = a1 instanceof Object ; 
	  System.out.println("is pointing to type of Object "+isObject);
	}
	
	public static Animal getMyAnimal() {
		return new Cat();
		
		
		
	}
}
