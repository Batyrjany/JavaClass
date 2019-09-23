package Assignments;

public class replit196 {

	
	private int x;
	
	private int y;

	private int result;
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getResult() {
		return result;
	}
	public void plus() {
		result=x+y;
	}
	public void minus() {
		result=x-y;
	}
	public static void main(String[] args) {
	
		replit196 a = new replit196();
		  a.setX(1);
		  a.setY(1);
		  a.plus();
		  a.minus();
		  System.out.println("1+1 = "+ a.getResult());//1+1 = 2
		  System.out.println("1-1 = "+ a.getResult());//1-1 = 0

	}

}
