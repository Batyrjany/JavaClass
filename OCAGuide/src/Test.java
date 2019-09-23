import java.io.IOException;

public class Test {

	int a1;
	public static void doProduct(int a){ 
		a = a * a;
	}
	
	public static void doString(StringBuilder s) { 
		s.append(" " + s);
		}
	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 3; i++) { for (int j = 3; j >= 0; j--) {
			if (i == j)
			continue;
			System.out.println("i:"+i + " - " +"j:" +j);
			} }
		
		
		
		
		
		
		//		Test item = new Test(); 
//		item.a1 = 11;
//	StringBuilder sb = new StringBuilder("Hello"); 
//	Integer i = 10; 
//	doProduct(i); 
//	doString(sb);
//	doProduct(item.a1); 
//	System.out.println(i + " " + sb + " " + item.a1);
		
		
		
		
//		X xobj = new X();
//		xobj.printFile();
//	
//		
//		double [] d= {8387066.0, 8387066.0, 10.0, 800.0, 900.0, 729909.0, 303475.0, 1010132.0, 697731.0, 1115649.0, 900431.0, 1673374.0, 440463.0, 1513192.0, 1000.0};
//		double d1 =0;
//		
//		for(int i = 0; i<d.length;i++) {
//			
//			d1+=d[i];
//		}System.out.println(d1);
//		
//		Integer i = (int) ( Math.random()*10);
//		System.out.println(i);
//		String str =i+"";
//		
//		System.out.println(str);
		
	}
	
	
	     
}
class X{
	
	public void printFile() throws IOException {
		throw new IOException();
	}
}