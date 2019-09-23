package Assignments;

public class replit231 {

	
	public static void main(String[] args) {
	    
		
		 String str = "aabbcccddd";
		System.out.println( countLetters(str));
		 
//		    int[] counts = new int[(int) Character.MAX_VALUE];
//		    // If you are certain you will only have ASCII characters, I would use `new int[256]` instead
//
//		    for (int i = 0; i < str.length(); i++) {
//		        //char charAt = str.charAt(i);
//		        counts[(int) str.charAt(i)]++;
//		    }
//
//		    for (int i = 0; i < counts.length; i++) {
//		        if (counts[i] > 0)
//		            //System.out.println("Number of " + (char) i + ": " + counts[i]);
//		            System.out.print(""+ counts[i] + (char) i + "");
//		        
//		    }
		    
		    
//		    for (int i = 0; i < str.length(); i++) 
//		    {
//		     int freq = 1;
//		     while((i+1)<str.length()&&str.charAt(i) == str.charAt(i+1))
//		      {
//		    	++freq;
//		        ++i;
//		      }
//		     System.out.print(""+freq+str.charAt(i)+"");
//		    }
		    
		    
		  }
	
	  
	  public static String countLetters(String str){
		  String newstr="";
		  for (int i = 0; i < str.length(); i++) 
		    {
		     int freq = 1;
		     while((i+1)<str.length()&&str.charAt(i) == str.charAt(i+1))
		      {
		    	++freq;
		        ++i;
		      }
		    // System.out.print(""+freq+str.charAt(i)+"");
		     
		   newstr+= ""+freq+str.charAt(i)+"";
		    }
	    return newstr;
	  }
	  
	  
	  
	  
	
}
