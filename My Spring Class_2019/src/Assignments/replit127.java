package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class replit127 {

	public static void main(String[] args) {
		

		
		 Scanner scan = new Scanner(System.in);
		    String str = scan.nextLine();
		    
		    String[] words = str.split(", ");
		   
		    String shortest = words[0];
		       
		   for (int i = 0; i < words.length; i++) {
			
		    	if(shortest.length()>words[i].length()){
		        shortest = words[i];
		      }
		    }
		    int counter = 0;
		    for (int j = 0; j < words.length; j++) {
			
		    	 if(shortest.length() == words[j].length()){
		        counter++;
		      }
		    }
		   
		     String[] shortWords = new String[counter];
		     
		   for(int i=0, j =0 ; i < words.length; i++){
		     
			   if(shortest.length()==words[i].length()){
		    	 
		        shortWords[j]=words[i];
		        j++;
		     }
		   }
		   //print new array
		   
		 Arrays.sort(shortWords);
		   
		   System.out.println(Arrays.toString(shortWords));
		  }
		}

