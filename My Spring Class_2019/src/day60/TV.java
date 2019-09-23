package day60;

public class TV {

	
int channelCount=100;
	
	
	public void play() {
		
		System.out.println("Playing TV...");
	}


	public int getChannelCount() {
		return channelCount;
	}


	public void setChannelCount(int channelCount) {
		this.channelCount = channelCount;
	}
	public static void doTVStatic() {
		System.out.println("do TV Static..");
	}
	
}
