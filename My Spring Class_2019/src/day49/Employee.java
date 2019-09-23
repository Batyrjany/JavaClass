package day49;

public class Employee {

	
	private String Title;
	private int id;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [Title=" + Title + ", id=" + id + "]";
	}
	
	
}
