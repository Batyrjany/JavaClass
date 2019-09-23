package Assignments;

public class replit164 {

	public static void main(String[] args) {
		
		boolean available=false;
		boolean gift=true;
		int ingredient1=1;
		int ingredient2=1;
		int ingredient3=2;;
		System.out.println(getThunderBlazz( available,
		            gift,  ingredient1 ,
		            ingredient2,  ingredient3));

	}

	
	 public static   boolean getThunderBlazz(boolean available,
			           boolean gift, int ingredient1 ,
			           int ingredient2, int ingredient3){
//		available=false;
//		gift=true;
//		ingredient1=1;
//		ingredient2=1;
//		ingredient3=2;
		 boolean isCorrect=true;
		if(available==true || gift==true || (ingredient1==1 && ingredient2==2 && ingredient3==3 )|| (ingredient1==3 && ingredient2==1 && ingredient3==2 )) {
			isCorrect=true;
		}else {
			isCorrect=false;
		}
		
		
		
		
		return isCorrect;
				
	
				}
		
			  }

