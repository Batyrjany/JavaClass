package Assignments;

public class replit201 {

	int channel=1;
	int volumeLevel=1;
	boolean on = false;
	String brand = "undefined"; 
	
	
	
	
	public replit201(){
		System.out.println("Creating TV object using no Args-constructor");
	}
	public replit201(String brand) {
		this.brand=brand;
		System.out.println("Creating TV object using 1 Args-constructor");

	}
	
	public int getVolumeLevel() {
		return volumeLevel;
		
	}
	public void setVolumeLevel(int volumeLevel) {
    		if(volumeLevel>=1 && volumeLevel<=7 ) {
    			this.volumeLevel=volumeLevel;
    		
    	}else {
    		System.out.println("ERROR: TV is either OFF or invalid Volume level");
    	
    	}
	}
	public String getBrand() {
		return brand;
		
	}
	public void setBrand(String brand) {
		this.brand=brand;
		
	}
	public int getChannel() {
		
			return channel;
		
	}
	public void setChannel(int channel) {
		if(on && channel>= 1 && channel<=120 ) {
			this.channel=channel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");	
		}		
		}
	
	public void channelUp() {
		if(on && channel<=120) {
		channel++;	
	}else {
		System.out.println("ERROR: TV is either OFF or invalid Channel");
	}
	}
    public void channelDown() {
    	if(on && channel>0) {
		channel--;
    	}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
    	}
    }
		
    public void volumeUp() {
    	if(on && volumeLevel<=7)
    	volumeLevel++;
    }
    public void volumeDown() {
    	if(on && volumeLevel>=1)
        	volumeLevel--;
    	}
    public  boolean isOn() {
		return on;
			}
 
    public void turnOn() {
    
		if(on) {
			System.out.println("TV is already ON");
			
		}else {
			on=true;
		}
		
    }
    public void turnOff() {
    	if(on==false) {
    		System.out.println("TV is already OFF");
			
		}else {
			on=false;
		}
    }
    
	public static void main(String[] args) {
		
		replit201 a = new replit201();
		
		System.out.println(a.getChannel());
		System.out.println(a.getVolumeLevel());
	    System.out.println(a.isOn());
		System.out.println(a.getBrand());
		System.out.println("--------");
		
	    
	    //a.turnOff();
	    //a.turnOn();
	     System.out.println(a.isOn());
//		a.turnOff();
//		System.out.println(a.isOn());
		//a.channelUp();
		//a.channelDown();
	    a.setChannel(122);
	   // a.channelDown();
		System.out.println(a.getChannel());
        //a.setVolumeLevel(3);
	   //a.volumeUp();
		//a.volumeDown();
		
		//System.out.println(a.getVolumeLevel());

	}

}
