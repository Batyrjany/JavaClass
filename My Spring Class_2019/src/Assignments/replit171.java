package Assignments;

public class replit171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String target= "longword";
		String word = "foo";
		System.out.println(at3(target,word));
		
		
		
	}
	 public static String at3(String target,String word)
	  {
		
		 String merge = "";
			merge+=target.substring(0,3)+word+target.substring(3,target.length());
	//System.out.println(merge);
		 
		 
		 
		 
		 return merge;
	    
	  }
	}