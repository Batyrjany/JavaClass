package day58;

public class Triangle extends Shape {

	
	int height;
	int base;
	@Override
	public void draw() {
		System.out.println("Drawing Triangle...");
		
	}
	@Override
	public double calculateArea() {
		
		int area= (this.height*this.base)/2;
		
		return area;
		
	}
	public Triangle( String color, int height, int base) {
		super.color=this.color;
		this.height = height;
		this.base = base;
	}
	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + "]";
	}
	
	public static void main(String[] args) {
		
		
		
		Triangle t = new Triangle("yellow",10 , 5);
		
		System.out.println(t.calculateArea());
		t.draw();
		t.drawline(3);
		
		
		System.out.println();
		
		
		Square s = new Square("red", 6);
		
	System.out.println(s.calculateArea());
	
	s.draw();
	s.drawline(4);
	
	System.out.println(DRAWING_TOOL);
	}
	
	
}
