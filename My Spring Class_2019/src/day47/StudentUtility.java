package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentUtility {

	
	public static ArrayList <String> StudentList;// new ArrayList<> ();
	
	
	static {
		System.out.println("Welcome to Student Utility");
		//displayAllStudent();
	}
	static {
		
		loadAllMyData();
		
	System.out.println("Students has been loaded");
		
	}
	static {
		
		//displayAllStudent();
	}

	/*public static void main(String[] args) {
		//System.out.println(StudentList);
		//displayAllStudent();//before adding a new name
		addStudent ("Mergen");
		//displayAllStudent();//after adding a new name
		updateStudent(5, "Lale");//updating the the name at the mentioned index
		//displayAllStudent();
		removeName(0);
		//displayAllStudent();
		StudentList.clear();
		displayAllStudent();
		
		
	}
	*/
	public static void displayAllStudent(){
		
		for (int i = 0; i < StudentList.size(); i++) {
			
			
			System.out.println("No :"+ (i+1)+" "+StudentList.get(i));
		}
		
		}
		private static void loadAllMyData() {
			
			
			StudentList= new ArrayList<> ();
			StudentList.add("Batyr");	
			StudentList.add("Jemal");
			StudentList.add("Jelal");
			StudentList.add("Gozel");

		}
		
	
	public static void addStudent (String name) {
		
		StudentList.add(name);
		
	}
	
	
	public static void updateStudent(int num, String newName) {
		
		if(num>=StudentList.size()) {
			System.out.println("OUT OF RANGE");
		}
		StudentList.add(num, newName);
	}
	
	public static void removeName(int x) {
		
		if(x>=StudentList.size()) {
			System.out.println("OUT OF RANGE");
		}
		StudentList.remove(x);
	}
public static void clearStudent () {
		
		StudentList.clear();
		
	}
		
	}

