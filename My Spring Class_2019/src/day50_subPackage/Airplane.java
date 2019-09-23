package day50_subPackage;

import day50.Vehicle;

public class Airplane extends Vehicle {

	private int wingCount;
	public Airplane(String brand, String model, int year, int wingCount) {
		super(brand, model, year);
		this.wingCount=wingCount;
	}
	
	
	
	
	public int getWingCount() {
		return wingCount;
	}




	public void setWingCount(int wingCount) {
		this.wingCount = wingCount;
	}




	@Override
	public String toString() {
		return "Airplane [wingCount=" + wingCount
				+ ", year=" + year + ","
						+ " brand=" + getBrand() +
						", model="
				+ getModel() + "]";
	}




	public static void main(String[] args) {
		
		Airplane a1 = new Airplane("Boeing", "737", 2020, 4);
		Vehicle  v1 = new Vehicle ("Airbus", "A380", 2020);
		System.out.println(a1);
		System.out.println(a1.year);
		System.out.println(v1.toString());
		
		
		
	}
	
	

	
}