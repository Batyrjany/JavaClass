package day58;

public class Square extends Shape{

	int sideLength;

	@Override
	public void draw() {
		System.out.println("Draw Shape");
	}

	@Override
	public double calculateArea() {
		int area= this.sideLength*this.sideLength;
		
		return area;
		
	}

	
	@Override
	public String toString() {
		return "Square [sideLength=" + sideLength + "]";
	}

	public Square(String color,int sideLength) {
		super.color=color;
		this.sideLength = sideLength;
	}
	
	public   void  drawline(int  n ) {
		  System.out.println("Drawing "+ n + "line(s)");
	}
	
}
