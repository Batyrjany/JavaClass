package day57;

public class IceCoffee implements Drinkable{

	
	int size;
	
	
	
	public IceCoffee(int size) {
	
		this.size = size;
	}

	@Override
	public String toString() {
		return "IceCoffee [size=" + size + "]";
	}

	@Override
	public void eat() {
		System.out.println("Eating a  delicious burger ....");
		
	}

	@Override
	public void drink() {
		System.out.println("Everyone drinking cofee....");
		
	}

	
	
	public static void main(String[] args) {
		
		Burger b= new Burger("McDonald's", 2);
		
		b.eat();
		
		
		
		IceCoffee i = new IceCoffee(3);
		
		i.drink();
		i.eat();
	}
	
	
	
}
