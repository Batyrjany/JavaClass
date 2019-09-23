
public class Base implements Left,Right{

	

	
	
	
	
	public void test() {
		System.out.println("Base");
	}
	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Left.super.m1();
	}


	public static void main(String[] args) {
		
		Base t = new Base();
		t.m1();
		
		
		Base b1 = new DerivedB();
		Base b2 = new DerivedA();
		Base b3 = new DerivedB();
		b1 = (Base) b3;
		DerivedB b4 =  (DerivedB) b3;
		
//		b1.test();
//		b4.test();
		
	}
	
}
class DerivedA extends Base{
	
	public void test() {
		System.out.println("DerivedA");
	}
}
class DerivedB extends Base{
	
	public void test() {
		System.out.println("DerivedB");
	}
	
	
	
}



interface Left
{
	default void m1()
	{
		System.out.println("Left Default Method");
	}
}
interface Right
{
	default void m1()
	{
		System.out.println("Right Default Method");
	}
}