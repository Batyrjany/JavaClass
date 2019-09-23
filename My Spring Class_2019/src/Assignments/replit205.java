package Assignments;

public class replit205 {

	
	double amount;
	double capacity;
	
	
	public replit205(double d) {
		
		this.capacity=d;
	}
	
	public void addGas(double added) {
		if(this.amount<this.capacity) {
			this.amount+=added;
		}else {
				this.amount=this.capacity;
		}
	}
	public void useGas(double used) {
		if(this.amount>0) {
			this.amount-=used;
		}else
			this.amount=0;  
	}
	public boolean isEmpty() {
		if(this.amount<0.1) {
			return true;
		}else
		return false;
	}
	public boolean isFull() {
		if(this.amount>this.capacity-0.1) {
			return true;
		}else
		return false;
	}
	
	public double getGasLevel() {
		return this.amount;
	}
public double fillUp() {
	double needed = this.capacity-this.amount;
	return needed;
	
}
public static void main(String[] args) {
	replit205 t = new replit205(50);
	System.out.println(t.amount);
	t.addGas(49);
	System.out.println(t.amount);
	t.useGas(48.91);
	System.out.println(t.amount);
	System.out.println(t.isEmpty());
	System.out.println(t.fillUp());
	System.out.println(t.isFull());
	t.addGas(49.8);
	System.out.println(t.amount);
	System.out.println(t.isFull());
}

}
