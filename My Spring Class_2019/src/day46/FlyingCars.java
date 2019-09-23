package day46;

public class FlyingCars {

	
	//int engineSize;
	//String name;
	private static FlyingCars fcar;
	//public FlyingCars() {

	private FlyingCars() {
		
	}
	
	public static FlyingCars getInstance() {
		
		FlyingCars f1 =new FlyingCars();
		
		return f1;
		
	}
}
