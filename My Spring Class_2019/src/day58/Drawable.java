package day58;

public interface Drawable {

	
	
	  public static final String DRAWING_TOOL ="Pencil";
	  
	 public abstract void draw();
	  
	  default  void  drawline(int  n ) {
		  System.out.println("Drawing "+ n + "line(s)");
	}
	  
	  public static void  printDrawingTool() {
		  
	  }
	  
	  
}
