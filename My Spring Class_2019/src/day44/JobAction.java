package day44;

import java.util.*;

public class JobAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Job j1= new Job();
		    Job j2= new Job("Senior Sdet");
		    Job j3= new Job("Scrum Master","Oracle",130000);
		    Job j4= new Job("Sdet","Santander",125000);
		    Job j5= new Job("Tester", "Google", 100000);  
		    Job j6= new Job("Programmer", "Apple", 2000000); 
		    
		    System.out.println( j1.getAnualSalary()  );
		    System.out.println( j1.getTitle()  );
		    
		    
		    System.out.println(j1.toString() );
		    System.out.println(j2.toString() );
		    System.out.println(j3.toString() );
		    System.out.println(j4.toString() );
		    System.out.println(j5.toString() );
		    // if we print out any reference variable directly 
		    // it will by default call j6.toString() 
		    System.out.println(j6 ); 
		   
		    System.out.println("-----");
		    
		    List<Job> jobs = new ArrayList<>();
		    jobs.add(new Job("Programmer", "Apple", 2000000));
		    jobs.add(j2);
		    jobs.add(j3);
		    jobs.add(j4);
		    jobs.add(j5);
		    jobs.add(j6);
		    
		    
		    //System.out.println(jobs);
		    System.out.println(jobs.get(0));
	
		    System.out.println("-----------");
		    for (Job job : jobs) {
				System.out.println(job);
			}
	
		    
		    System.out.println("*********");
	List<String> str = new ArrayList<>();
	
	str.add("Batyr");
	str.add("Jemal");
	str.add("Jelal");
	
	System.out.println(str);
	System.out.println(str.get(2));
	
	 System.out.println("*********");
		List<Integer> num = new ArrayList<>();
		
		num.add(123);
		num.add(456);
		num.add(789);
		
		System.out.println(num);
		System.out.println(num.get(2));
	}

		
		
		}
