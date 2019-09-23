package day56;

class Rectangle extends Shape{

	
	
	protected int width, height;
	public Rectangle(String color,int width, int height) {
		super(color);
		
this.height=height;
this.width = width;

		
		
		
	}
	@Override
	void calculatePerimeter() {
		
		
		int per1=(width+height)*2;
		System.out.println(per1);
		
	}
	@Override
	void calculateArea() {
		

		int area = width*height;
		System.out.println(area);
		
	}
	

	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
	}
	
	
	
	public static void main(String[] args) {
		
		
		Circle c= new Circle("yellow", 2);
		
		Rectangle r = new Rectangle("red", 5, 3); 
		
		
		System.out.println(c);
		System.out.println();
		System.out.println(r);
		
		
		System.out.println(c.radius);
		c.calculateArea();
		c.calculatePerimeter();
		System.out.println();
		System.out.println(r.height);
		System.out.println(r.width);
		r.calculateArea();
		r.calculatePerimeter();
		
	}
	
}