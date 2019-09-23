
public class Test1 {

	
		
		public static void method1() {
			
			double d = Math.random();
			try {
				
				throw   d > 0.5 ? new MyException() : new RuntimeException();
				
			}catch(RuntimeException re) {
				System.out.println("RuntimeException");
			}System.out.println(d);
		}
		
		
		public static void main(String[] args) {
			try {
				method1();
			}catch(MyException ne){
			
				System.out.println("MyException");
			}
		}
}
