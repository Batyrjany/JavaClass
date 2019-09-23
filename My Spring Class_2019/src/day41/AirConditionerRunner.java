package day41;

public class AirConditionerRunner {

	public static void main(String[] args) {
		
		AirConditioner ac =new AirConditioner();
		
		ac.brand = "Samsung";
		ac.currentTemp = 57f;
	    ac.isOn  =true;
		
	    ac.displayTheBrand();
		ac.displayAllInfo();
		
		ac.turnOf();
		ac.turnOn();
		//ac.showCurrentTemp();
		
		
		ac.increaseTemp(50);
		//ac.showCurrentTemp();
		
		ac.decreaseTemp(30);
		//ac.showCurrentTemp();
		
		ac.setTemp(70f);
		//ac.showCurrentTemp();
		
		System.out.println();
		
		
		
		AirConditioner ac1 =new AirConditioner();
		
		
		ac1.brand = "Philips";
		ac1.currentTemp =44f;
	    ac1.isOn  =false;
		
	    ac1.displayTheBrand();
		ac1.displayAllInfo();
		
		ac1.turnOf();
		ac1.turnOn();
       // ac1.showCurrentTemp();
		
		
		ac1.increaseTemp(50);
		//ac1.showCurrentTemp();
		
		ac1.decreaseTemp(30);
		//ac1.showCurrentTemp();
		
		System.out.println();
		
		
		AirConditioner ac2 =new AirConditioner();
		
		
		ac2.brand = "Akira";
		ac2.currentTemp =56f;
	    ac2.isOn  =false;
		
	    ac2.displayTheBrand();
		ac2.displayAllInfo();
		
		ac2.turnOf();
		ac2.turnOn();
       // ac2.showCurrentTemp();
		
		
		ac2.increaseTemp(50);
		//ac2.showCurrentTemp();
		
		ac2.decreaseTemp(30);
		//ac2.showCurrentTemp();
		
		ac2.setTemp(70f);
		//ac2.showCurrentTemp();
		
		
		
	}

}
