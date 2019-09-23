package Inheritance_Employee;

public class Dog extends Animal {

	private int teeth;
	
	
	public Dog(String name, int weight, int height, int legs, int teeth) {
		super(name, weight, height, legs);
		
      this.teeth=teeth;
	}

	@Override
	public void showInfo() {
		
		//System.out.println("Name is :" +this.name+"\n Weight is : "+this.weight+"\nHeight is : "+this.height+"\nLegs : "+legs);
		super.showInfo();
	System.out.println("Teeth : "+this.teeth);
		
	}
	
	@Override
	public void move(int speed) {
		
		
		System.out.println("Dog is moving with velocity of "+ speed+" km/h");
		
	}
	
	public void run(int speed) {
		System.out.println("Dog is running...");
		//super.move(speed);
		move(speed);
		
	}
}
