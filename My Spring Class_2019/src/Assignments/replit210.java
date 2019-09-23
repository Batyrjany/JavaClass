package Assignments;

public class replit210 {

	int imageSize;
	  int memorySize;
	  
	  public replit210(int i,int m){
	  this.imageSize = i;
	  this.memorySize= m;
	  }
	    public int numPictures(){
	      int result = this.memorySize*1000/imageSize;
	      return result;
	    }
	
	public static void main(String[] args) {
		
		replit210 n = new replit210(2,4);

		
		System.out.println(n.numPictures());
	}

}
