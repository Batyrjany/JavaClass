package day49;

public class Action {

	public static void main(String[] args) {
		

		Employee e = new Employee();
		
		
		FullTimeEmployee f = new FullTimeEmployee();
		
		f.salary=100000;
		f.insurance="Full Coverage";
		f.setTitle("SDET");
		f.setId(100);
		System.out.println(f.getTitle());
		System.out.println(f.getId());
		
		System.out.println("--------");
		
		Teacher t = new Teacher();
		t.teacherId = 12;
		t.energyLevel=300;
		t.setTitle("PhD");
		t.setId(50);
		System.out.println(t.getTitle());
		System.out.println(t.getId());
	}

}
