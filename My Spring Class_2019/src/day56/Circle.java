package day56;

class Circle extends Shape{
	
	double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	void calculatePerimeter() {
		
		double per = 2*3.14*this.radius;
		System.out.println(per);
	}

	@Override
	void calculateArea() {
	
		double area = 3.14*(this.radius*this.radius);
		
		System.out.println(area);
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	

	
	
	
	
}
