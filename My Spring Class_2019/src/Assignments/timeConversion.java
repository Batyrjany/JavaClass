package Assignments;

public class timeConversion {

	public static void main(String[] args) {
		

		
		String s = "12:01:52AM";
		 /*
		 * Write your code here.
		 */
		// 07:05:45PM
		//Integer.valueOf() converts string into a number
		 String result = "";
		 //we are getting hours and converting into an int
		 int hours = Integer.valueOf(s.substring(0, s.indexOf(":")));
		 //this is for practice
		 int minutes = Integer.valueOf(s.substring(s.indexOf(":")+1, s.lastIndexOf(":")));
		 int seconds = Integer.valueOf(s.substring(s.lastIndexOf(":")+1, s.indexOf("M")-1));
		 //:05:45
		 //this what will not be cahnged
		 //beacause minutes and seconds remains to be the same
		 String minutesAndSeconds = s.substring(s.indexOf(":"), s.indexOf("M")-1);
		 //case for AM
		 if(s.endsWith("AM")){
		    if(hours==12){
		      result = "00"+minutesAndSeconds;
		    }else{
		      //replace will delete AM
		      //07:05:45PM will replace PM with nothing 07:05:45
		      result = s.replace("AM", "");
		    }
		 }else{
		   if(hours==12){
		     //we are removing PM from the end
		     result = s.replace("PM", "");
		   }else{
		     //we are calculating hours 
		     result = (hours+12)+minutesAndSeconds;
		   }
		 }
		 System.out.println(result);
  }







	}

