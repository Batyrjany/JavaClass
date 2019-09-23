package Exercise_contr_get_set;

public class Exercise {


private int burpee;
private int pushup;
private int situp;
private int squat;
public Exercise(int burpee, int pushup, int situp, int squat) {

	this.burpee = burpee;
	this.pushup = pushup;
	this.situp = situp;
	this.squat = squat;
}
public int getBurpee() {
	return burpee;
}
public void setBurpee(int burpee) {
	this.burpee = burpee;
}
public int getPushup() {
	return pushup;
}
public void setPushup(int pushup) {
	this.pushup = pushup;
}
public int getSitup() {
	return situp;
}
public void setSitup(int situp) {
	this.situp = situp;
}
public int getSquat() {
	return squat;
}
public void setSquat(int squat) {
	this.squat = squat;
}

public void move(String exercixe_type, int count) {
	
	if(exercixe_type.equalsIgnoreCase("burpee")) {
		
		doBurpee(count);
	}else if(exercixe_type.equalsIgnoreCase("pushup")) {
		
		doPushup(count);
		
	}else if(exercixe_type.equalsIgnoreCase("situp")) {
		
		doSitup(count);
	}else if(exercixe_type.equalsIgnoreCase("squat")) {
		
		doSquat(count);
	}else {
		System.out.println("Invalid Exercise!");
	}
}
	public void doBurpee(int count) {
		
		if(burpee==0) {
			
			System.out.println("No more burpee to do...");
		}
		if(burpee-count<0) {
			System.out.println("You' ve passed aimed amount. Congrats!");
			burpee=0;
			System.out.println(burpee+" burpee left");
			
		}else {
			burpee-=count;
			System.out.println(burpee+" burpee left");
		}
	}
	public void doPushup(int count) {
		
		if(pushup==0) {
			
			System.out.println("No more pushup to do...");
		}
		if(pushup-count<0) {
			System.out.println("You' ve passed aimed amount. Congrats!");
			pushup=0;
			System.out.println(pushup+" pushup left");
			
		}else {
			pushup-=count;
			System.out.println(pushup+" pushup left");
		}
	}
public void doSitup(int count) {
		
		if(situp==0) {
			
			System.out.println("No more situp to do...");
		}
		if(situp-count<0) {
			System.out.println("You' ve passed aimed amount. Congrats!");
			situp=0;
			System.out.println(situp+" situp left");
			
		}else {
			situp-=count;
			System.out.println(situp+" situp left");
		}
	}

public void doSquat(int count) {
	
	if(squat==0) {
		
		System.out.println("No more squat to do...");
	}
	if(squat-count<0) {
		System.out.println("You' ve passed aimed amount. Congrats!");
		squat=0;
		System.out.println(squat+" squat left");
		
	}else {
		squat-=count;
		System.out.println(squat+" squat left");
	}
}
	
public boolean isExerciseDone() {
	return ((burpee==00) && pushup==0 && situp==00 && squat==0);
	
}


}
