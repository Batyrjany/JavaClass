package day60;

import java.util.*;

public class Smart_TV extends TV {

	int channelCount=200;
public void play() {
		
		System.out.println("Playing Smart_TV...");
	}


//@Override
//public int getChannelCount() {
//	
//	return channelCount;
//}
public static void doTVStatic() {
	System.out.println("do TV Static..");
}


public static void main(String[] args) {
	
	
	//List<String> lst = new ArrayList<>();
	
	TV tv= new Smart_TV();
	
	System.out.println(tv.channelCount);
	
	tv.play();
	System.out.println(tv.getChannelCount());
	
	tv.doTVStatic();
	
	
}
}
