package day41;

public class AirConditioner {

//	WARM UP 
//    Create a class called AirContitioner 
//    Add instance fields 
//        brand as String 
//        currentTemp as float  
//        isOn as boolean  
//    Add below behaviors 
//        displayTheBrand() ;
//            accept no paramter and print out the brand  
//        showCurrentTemp
//            accept no paramter and
//            simply display current temp on console 
//        displayAllInfo 
//            accept no paramter and display all AC info 
//        turnOn 
//            accept no parameter 
//            and set isOn value to true if it's not already true
//        turnOf 
//            accept no parameter 
//            and set isOn value to false if it's not already true




	
String brand;
float currentTemp;
boolean isOn;


public void displayTheBrand() {
	
	System.out.println("The brand is "+ brand);
	
}
public void showCurrentTemp() {
	
	System.out.println("The temp is "+ currentTemp);
	
}


public void displayAllInfo() {
	
	System.out.println("The barnd is "+ brand+"| The temp is "+ currentTemp+"| Ic AC on ? "+isOn);
	
}

public void turnOn() {
	
	System.out.println("The AC is "+ isOn);
	
	if(!isOn) {
		isOn = true;
	}else {
		System.out.println("It's already on !!! ");
	}

}
    public void turnOf() {
    	if(isOn) {
    		isOn = false;
    	}else {
    		System.out.println("It's already off !!! ");
    	}
}

    public void increaseTemp(int increaseBy) {
    	
    	
    	currentTemp+=increaseBy;
    	System.out.println("the temp after inceasing is "+currentTemp);
    }
    
public void decreaseTemp(int decreaseBy) {
    	
    	
    	currentTemp-=decreaseBy;
    	// an instance method can be called 
    	// inside another instance method directly
    	//just like an instance field can be accessed
    	//directly inside any other method
    	showCurrentTemp();
    	
    }
    
public void setTemp(float targetTemp) {
	
	
	currentTemp = targetTemp;
	// calling instance method of same class directly 
    // in another instance method 
	showCurrentTemp();
}


}





