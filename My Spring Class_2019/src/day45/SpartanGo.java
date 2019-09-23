package day45;

public class SpartanGo {

	public static void main(String[] args) {
		

		Spartan s1= new Spartan();
		
		System.out.println(s1);
		System.out.println("------");
		String [] certs = {"OCA","PSM","AWS","OCP"};
	
	Spartan s2 = new Spartan("Coder", 8, 600, false, certs);
	Spartan s3 = new Spartan("Coder1", 9, 500, false, new String[] {"OCA"});
	Spartan s4 = new Spartan("Coder2", 10, 300, false, new String [] {});
	Spartan s5 = new Spartan("Coder3", 6, 200, true, null);
	Spartan s6 = new Spartan("Batyr", 12, 250, false, new String[] {"OCA"});
	Spartan s7 = new Spartan(true);

	
	
//	System.out.println(s2);
//	System.out.println(s3);
//	System.out.println(s4);
//	System.out.println(s5);
	System.out.println(s6);
	System.out.println(s7);
	
	}

}
