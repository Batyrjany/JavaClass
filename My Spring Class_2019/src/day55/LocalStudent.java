package day55;

public class LocalStudent extends Student {

	int seatID;
	
	public LocalStudent(int id, String name, int seatID) {
		super(id, name);
		this.seatID=seatID;
		
	}

	
	
	@Override
	public void attendClass() {
		System.out.println("ATTEND THE CLASS LOCALLY");
	}
	
	
	
}
