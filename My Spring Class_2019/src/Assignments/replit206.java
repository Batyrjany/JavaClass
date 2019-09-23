package Assignments;

public class replit206 {

	
	private int value;
	private boolean modified;
	
	public replit206(int value) {
		
			this.value=value;
	}
    public replit206() {	
	}
    public void setValue(int value) {
     this.value=value;
		modified =true;
	}
    public int  getValue() {
		if(value!=0) {
			return value;
		}else {
			return 0;
		}
		}
    public boolean wasModified() {
		
			return modified;
	}
	
		
		
		

	public static void main(String[] args) {
		
        replit206 v = new replit206();
        replit206 v1 = new replit206(5);
      System.out.println("initial value of V");
           System.out.println(v.value);
           System.out.println(v.modified);
      System.out.println();
//      System.out.println("set V value");
//           v.setValue(1);
//          System.out.println(v.value);
//          System.out.println(v.modified);
          System.out.println();
      System.out.println("initial value of V1");
           System.out.println(v1.value);
           System.out.println(v1.modified);    
       System.out.println();
       System.out.println("get the value of V");
          System.out.println(v.getValue());
          System.out.println(v.modified);
       System.out.println();
       System.out.println("get the value of V1");   
          System.out.println(v1.getValue());

	}

}
