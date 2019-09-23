package day24;

public class ArrayTask {

	public static void main(String[] args) {


 char[] c = new char[6];	
	c[0]='b';	
	c[1]='a';	
	c[2]='t';	
	c[3]='y';	
	c[4]='r';	
		
		System.out.print(c[0]);
		System.out.print(c[1]);
		System.out.print(c[2]);
		System.out.print(c[3]);
		System.out.println(c[4]);
		
		
		for (int i =1; i<6 ; i++) {
			System.out.println(c[i]);
		}
		
		
		
		
		
		
		
		System.out.println();
		
		
		char[] c1 = new char[] {'g','o','z','e','l'};
		
		System.out.println(c1);
		
		for (int j=0; j<c1.length; j++) {
			
			System.out.print(c1[j]+" ");
		}
		
		
		
		
		System.out.println();
		
		
		char [] c2 = {'j','e','m','a','l'};
		
		System.out.println(c2);
	}

}
