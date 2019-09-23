package Assignments;

import java.util.*;

public class replit174 {

	
	
 
	public static String lameDb(String db, String op,String id,String data)
	  {
		int i=Integer.parseInt(id);
	    
		
		ArrayList<String> arr=new ArrayList<>(Arrays.asList(db.split("#")));
		
		
		
        if (op.equals("add"))
            arr.add(id+data);
        
        if (op.equals("edit"))
        	arr.set(i-1,id+data);
      
        if (op.equals("delete"))
        	arr.remove(i-1);
        
        String x="";
        for (String s:arr)
            x=x+"#"+s;
            
            
   return x.substring(1);
    
		
	
	    
	  }//end lameDb
	  
	public static void main(String[] args) {
		

	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
		
	
	   }
	  
	  
	}