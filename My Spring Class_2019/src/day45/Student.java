package day45;

public class Student {


		String name;
		int age;
		String major;
		
		
	
		public Student() {
			
			this("NO NAME");
			
			
			System.out.println("no arg");
		
		}



		public Student(String name) {
		
			System.out.println("1 arg "+name);
		
		}



		public Student(String name, int age, String major) {
		
			this();
			
			
			System.out.println("3 arg");
//			this.name = name;
//			this.age = age;
//			this.major = major;
		}

		
		
		
}
