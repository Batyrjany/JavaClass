package day34;

import java.util.Arrays;

import day27.forEachLoop;

public class ArrayMethod {

	public static void main(String[] args) {
		
		int n = 15;
	
		
		
		System.out.println("1");
		getArrayFrom1toX(n);
		
		System.out.println("2");
		int[] resultArray = getArrayFrom1toX(n);
		System.out.println("3");
		System.out.println(Arrays.toString(resultArray));
		System.out.println("4");
		getArrayFrom1toX(7);
		System.out.println("5");
		
		String num= Arrays.toString(getArrayFrom1toX(7));
		
		System.out.println("6");
		System.out.println(num);
	}

	
	public static int [] getArrayFrom1toX(int n) {
		
	
	
	
	
	int [] arr = new int [n];

	for (int i = 0; i < arr.length; i++) {
		arr[i]=i+1;
	}System.out.println(Arrays.toString(arr));
	
	
	return arr;
	
	
	
		
		
	}
}
