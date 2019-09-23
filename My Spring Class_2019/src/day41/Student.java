package day41;

public class Student {

	
	String name;
	int age;
	long ssn;
	
	public void giveName() {
		
		System.out.println("My name is "+ name);
		
	}
	
    public void giveAge() {
		
		System.out.println("My age is "+ age);
		
	}
    
    void giveSSN() {// default class
		
   //private void giveSSN() {// private class
    //public void giveSSN() {// public class
        
    
    System.out.println("My SSN is "+ ssn);
		
	}
}
