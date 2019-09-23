package day24;

public class GettingIndexArray {

	public static void main(String[] args) {
		

		char[] name = {'b','e','n','j','a','m','i','n'};
		
		int count = name.length;
		
		int midIndex = count/2;
		
		
		System.out.println("item in last index: "+name[count-1]);
		System.out.println("item in mid index: "+name[+midIndex]);

		
		
		
		for(int i=7; i>=0; i--) {
			
			System.out.print(name[i]+" ");
		}
		
	}

}
