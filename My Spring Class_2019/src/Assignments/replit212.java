package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class replit212 {

	
	
		  public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) 
		  {
			 
			  
			  int l = deliveries.size();
			  int count=0;
			  int sum=0;
//			    for (int i = 0; i < l; i++) {
//					if(deliveries.get(i)>=max_fuel && max_fuel>0) {
//						count+=deliveries.get(i)/max_fuel;
//					}else if(deliveries.get(i)<max_fuel && deliveries.get(i)>0) {
//						if(deliveries.get(i+1)<max_fuel && deliveries.get(i)>0)
//						count+=deliveries.get(i)+deliveries.get(i+1)/max_fuel;
//					}else {
//						count=0;
//					}
//			    	
//				}
			  
			    for(Integer each:deliveries){
			        sum+=each;
			      }
			    count=sum/max_fuel;//will check how may fuel need
			      if(sum%max_fuel!=0) count+=1;// if the result not 0 ,it will add 1 more fuel
			      return count;
	
		  }
		  
		  public static void main(String[] args)
		  {
		    
		    ArrayList<Integer>  arr = new ArrayList<>();
		    arr.add(3);
		    arr.add(3);
		    arr.add(1);
		    arr.add(2);
		    arr.add(6);
		    int times = refuel_times(arr,3);
		    System.out.print(times);//should output 5
		    System.out.println(arr);
		     
		    
		    
		    
		    int [] num = {1,2,3,4,5,6};
		    ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(num));
		    
		   
		    
		  }//end main
}
