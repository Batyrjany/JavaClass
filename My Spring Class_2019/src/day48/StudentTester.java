package day48;

public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Person p1= new Person();
		Student s1 = new Student();
		
		p1.age=30;
		p1.gender='M';
		p1.height=6;
		p1.name="John";
		s1.age =18;
		s1.gender= 'F';
		s1.height=6;
		s1.name="Rachel";
		s1.studentId=123;
		
		
		
		System.out.println(p1.name);
		p1.eat();
		
		System.out.println(s1.name);
		s1.eat();
	}

}
