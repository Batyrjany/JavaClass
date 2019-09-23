package day46;

public class StaticMemberAccesLevel {
	
	static int staticVar;
	int instanceVar;
	
	
public static void main(String[] args) {
	
	
	
	System.out.println("Value of static field num1 "+staticVar++);
	
//	int num2 =;
//	System.out.println(num2++);
	
	//System.out.println(num3);
	
	StaticMemberAccesLevel s1 = new StaticMemberAccesLevel();
	System.out.println("Value of instance field num3 "+s1.instanceVar++);
	System.out.println("-----");
	
	s1.doSomething();
	//s1.doStaticThing();
	
}


public void doSomething() {
	
	System.out.println("inside instance method ");
	System.out.println("instance variable "+instanceVar);
	System.out.println("static variable "+staticVar);

	System.out.println("--------");
}

public static void doStaticThing() {
	
	System.out.println("inside instance method ");
//	System.out.println("instance variable "+instanceVar);
	System.out.println("static variable "+staticVar);


	
}
}
