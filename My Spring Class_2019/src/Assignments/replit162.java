package Assignments;

public class replit162 {

	public static void main(String[] args) {
		
		
		
		
		

	}
	
	
	public boolean validateTask(boolean notEmpty,int taskId,int currentId)
	  {
		notEmpty = true;
		taskId = 7 ;
		currentId = 6 ;
		boolean  task=true;
	
		
		
		if(taskId!=0 && currentId !=0) {
			
			if(notEmpty==true && taskId==(currentId+1)) {
				task=true;
			}else {
				task=false;
			}
		}
		
		
		//System.out.println(task);
		
       return notEmpty;
		
	  }
	
	
	
}
