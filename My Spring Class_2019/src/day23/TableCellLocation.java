package day23;

public class TableCellLocation {

	public static void main(String[] args) {

	
		
		System.out.print("Cell("+1+","+1+")");
		System.out.print(" Cell("+1+","+2+")");
		System.out.print(" Cell("+1+","+3+")");
		System.out.print(" Cell("+1+","+4+")");
	
		
		System.out.println();
		
		for(int j =1; j<=3; j++) {
			
		//System.out.println("\n"+"Row :"+j);
for (int i = 1; i<=4; i++) {
	System.out.println("iteration :"+ (i+1));
	System.out.print(" Cell("+j+","+i+")");

}
		System.out.println();
		}		
			
		
//		for(int j =1; j<=3; j++) {
//			
//		System.out.println("\n"+"Row :"+j);
//for (int i = 1; i<=4; i++) {
//	
//	System.out.print("Column : "+i+"  ");
//
//}
//		
//		}		
//		

	}

}
