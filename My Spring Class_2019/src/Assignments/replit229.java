package Assignments;

import java.util.*;

public class replit229 {

	String id;
	String title;
	String content;
	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String blogDb(ArrayList<String[]> r,String id)  {
	
		
		String [] array=new String[r.size()];
		
for (int i = 0; i < r.size(); i++) {
	
		array[i]=r.get(i).toString();
	}

	
		
		return Arrays.toString(array);
	    
	    
		   
	  }
	  
	  public static void main(String[] args) {
		  replit229 m = new replit229();
	    ArrayList<String[]>  arr = new ArrayList<String[]>();
	    arr.add(new String[]{"1","title 1","content"});
	    arr.add(new String[]{"2","title 2","content"});
	    arr.add(new String[]{"3","title 3","content3"});

	    String post = m.blogDb(arr,"3");
	    System.out.print(post);
	    //should output:
	    //title 3 
	    //content3
	   
	    
	  }//end main

}
