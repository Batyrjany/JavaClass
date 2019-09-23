package day59;
import day58.*;
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Drawable d1 = new Triangle("Red", 5, 10);
		Drawable d2 = new Square("Yellow", 10);
		Drawable d3 = new Square("Orange", 8);
		IndoorPet myIndoorPet = new Cat();
		
		
		Drawable[] allDrawables = {d1,d2,d3};
		
		for (Drawable each : allDrawables) {
			System.out.println(each);
		}
		
		
		d1.draw();
		d2.draw();
		d1.drawline(3);
		d2.drawline(4);
		
	}

}
