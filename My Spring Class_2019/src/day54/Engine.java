package day54;

public class Engine {

	
	String EngineType;
	int cylinderCount;
	public Engine(String engineType, int cylinderCount) {
	
		EngineType = engineType;
		this.cylinderCount = cylinderCount;
	}
	@Override
	public String toString() {
		return "Engine [EngineType=" + EngineType + ", cylinderCount=" + cylinderCount + "]";
	}
	
	
	public void start() {
		
		
		System.out.println("Engine "+ EngineType + " with CylindeCount "+cylinderCount+" is starting...");
	}
	
}
