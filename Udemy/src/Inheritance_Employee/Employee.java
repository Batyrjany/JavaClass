package Inheritance_Employee;

public class Employee {

	
	private String name;
	private int salary;
	private String department;
	public Employee(String name, int salary, String department) {
		
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void  showInfo() {
		System.out.println( "Employee name= " + name + ",\nsalary= " + salary + ", \ndepartment= " + department );
	}
	
	
	
	public void change_department(String newDepartment) {
		System.out.println("Department has changed");

		this.department=newDepartment;
		System.out.println("New Department "+this.department);
		}
       public void work() {
		
		System.out.println("Employee is working ");
	}
	
}
