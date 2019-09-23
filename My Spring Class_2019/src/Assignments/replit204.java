package Assignments;

public class replit204 {

	
	int timeLeft=0;
	int maxTime;
	
	public replit204(int maxTime) {
		
		this.maxTime=maxTime;

	}
	public boolean add(int num) {
		if(num==25 && this.timeLeft<=this.maxTime) {
			this.timeLeft+=30;
			return true;
		}else {

		return false;
		}
	}	
	public void tick() {
		if(this.timeLeft>0) {
			this.timeLeft=this.timeLeft-1;
		}	

	}
public boolean isExpired() {
	if(this.timeLeft==0){
		return true;
	}
	else
	
	return false;	
	}


public static void main(String[] args) {
	
	replit204 p = new replit204(30);
	System.out.println(p.maxTime);
	System.out.println(p.timeLeft);
	System.out.println(p.isExpired());
	System.out.println(p.add(25));
	System.out.println(p.timeLeft);
	p.tick();
	System.out.println(p.timeLeft);
	System.out.println(p.isExpired());

	
}
}
