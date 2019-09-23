package day25;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		
		int[] nums= new int[4];
		
		
		String movies[] = new String[4];
		
		
		
		
		
movies[0]= "Life";
movies[1]= "without";
movies[2]= "love is";		
movies[3]= "meaningless";

System.out.println(Arrays.deepToString(movies));
System.out.println();

System.out.println(movies.length);
System.out.println(movies[0].length());

System.out.println();

int i =0;
System.out.println(movies[i].length());
i++;
System.out.println(movies[i].length());
i++;
System.out.println(movies[i].length());
i++;
System.out.println(movies[i].length());
i++;

System.out.println();


for (int x= 0; x<movies.length; x++) {
	System.out.println(movies[x]+" char count is: "+movies[x].length());
	
}


System.out.println();


int max = movies[0].length();

int index=0;

for(int a =0; a<movies.length; a++) {
	if(movies[a].length()>max) {
		
		max= movies[a].length();
		
		index=a;
	}
	
}


System.out.println(max);

System.out.println(index);

System.out.println(movies[index]);

	}

}
