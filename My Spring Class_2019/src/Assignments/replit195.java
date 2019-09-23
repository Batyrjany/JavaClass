package Assignments;

public class replit195 {

	private String data;
	private int yint;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getYint() {
		return yint;
	}

	public void setYint(int yint) {
		this.yint = yint;
	}

	public void insertData(String s, int i) {
		this.yint=i;
		this.data = s;
	}


	public static void main(String[] args) {
		
		replit195 a= new replit195();
		
		replit195 db = new replit195();
		 db.insertData("aaa",123);
		   
		   
		    System.out.println(db.getData());//aaa
		    System.out.println(db.getYint());//123
		  
		  db.setData("zzz");
		  db.setYint(200);
		  
		  System.out.println(db.getData());//zzz
		    System.out.println(db.getYint());//200
		    

	}
	
}
