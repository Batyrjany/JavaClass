package day27;

import java.util.Arrays;

public class ArraysSortMethod {

	public static void main(String[] args) {

int [] nums = {1,4,5,2,77,45};

System.out.println(Arrays.toString(nums));

Arrays.sort(nums);
		
System.out.println(Arrays.toString(nums));

		

// char array is sorted by ASCII Code value low to high

String name = "CyberTek123";
char [] nameChars = name.toCharArray();

Arrays.sort(nameChars);

System.out.println(Arrays.toString(nameChars));



String []  names = {"abc","efg", " ", "123", "Ku"};
Arrays.sort(names);
System.out.println(Arrays.toString(names));

String []  names1 = {"abe","abd", "abb"};
Arrays.sort(names1);
System.out.println(Arrays.toString(names1));




}
}