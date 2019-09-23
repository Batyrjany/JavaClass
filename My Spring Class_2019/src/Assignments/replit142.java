package Assignments;

public class replit142 {

	public static void printHollowRect()
	  {
	   String star = "";
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (i != 0 && i != 4 && j != 0 && j != 4) {
						star = " ";
					} else {
						star = "*";
					}
					System.out.print(star);
				}
				System.out.println();
			}
	  }
	  
	  public static void main(String[] args) {
	   
	    printHollowRect();
	  }
	  
	  
	  
	  
	}