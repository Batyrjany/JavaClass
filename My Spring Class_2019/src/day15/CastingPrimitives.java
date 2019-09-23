package day14;

public class CastingPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// byte-->int, upcasting, type widening
		// it happens compiler implicity
		
		byte x=10;
		int i  =  x;
		//int i = (int) x; // implicity 
		
		System.out.println(i);
		
		// int---->byte, downcasting, type narrowing
				// it happens compiler explicity
		int z = 20;
		//byte  b = z;//in this  case will complain
		byte b = (byte)z;// explicity
		System.out.println(b);
		
		double d = 12.12;
		int con=(int) d;//
		System.out.println(con);
		
	}

}
