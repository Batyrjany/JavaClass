package day45;

import java.util.Arrays;

public class Spartan {

	

		public Spartan(boolean tired) {
		this("Batyr",24,220,tired, new String[] {"BOSIET"});

		this.tired = tired;
		
		boolean  notEmpty1 = true;
		int taksId = 7 ;
		int currentId1 = 6 ;
		boolean  task=true;
	
		
		
		if(taksId!=0 && currentId1 !=0) {
			
			if(notEmpty1==true && taksId==(currentId1+1)) {
				task=true;
			}else {
				task=false;
			}
		}
		
		
		//System.out.println(task);
		
       return notEmpty1;
       boolean  notEmpty1 = true;
		int taksId = 7 ;
		int currentId1 = 6 ;
		boolean  task=true;
	
		
		
		if(taksId!=0 && currentId1 !=0) {
			
			if(notEmpty1==true && taksId==(currentId1+1)) {
				task=true;
			}else {
				task=false;
			}
		}
		
		
		//System.out.println(task);
		
      return notEmpty1;
      boolean  notEmpty1 = true;
		int taksId = 7 ;
		int currentId1 = 6 ;
		boolean  task=true;
	
		
		
		if(taksId!=0 && currentId1 !=0) {
			
			if(notEmpty1==true && taksId==(currentId1+1)) {
				task=true;
			}else {
				task=false;
			}
		}
		
		
		//System.out.println(task);
		
     return notEmpty1;
     boolean  notEmpty1 = true;
		int taksId = 7 ;
		int currentId1 = 6 ;
		boolean  task=true;
	
		
		
		if(taksId!=0 && currentId1 !=0) {
			
			if(notEmpty1==true && taksId==(currentId1+1)) {
				task=true;
			}else {
				task=false;
			}
		}
		
		
		//System.out.println(task);
		
    return notEmpty1;
		
	}

		String name;
		int studyHour;
		int horsePower;
		boolean tired;
		String [] certificate;
	
		public String toString() {
			return "Spartan [name=" + name + ", studyHour=" + studyHour + ", horsePower=" + horsePower + ", tired="
					+ tired + ", certificate=" + Arrays.toString(certificate) + "]";
		}

		public Spartan() {

			this("No Name", 5);
			
         System.out.println("no arg");
         
         
         
//         this.name = "No name";
//         this.horsePower =5;
          this.horsePower =320;
        // this.certificate= new String[] {"OCA","PSM","AWS","OCP"};
		}

		public Spartan(String name, int studyHour) {
		
			this.name = name;
			this.studyHour = studyHour;
		}

		public Spartan(String name, int studyHour, int horsePower, boolean tired, String[] certificate) {
	       this(name,studyHour);
//			this.name = name;
//			this.studyHour = studyHour;
			this.horsePower = horsePower;
			this.tired = tired;
			this.certificate = certificate;
		}
		
		
	
}
