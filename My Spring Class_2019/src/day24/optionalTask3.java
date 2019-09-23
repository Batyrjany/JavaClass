package day24;

public class optionalTask3 {

	public static void main(String[] args) {

int nums []= {1,4,6,8,9,5};

int max= nums[0];


for (int i = 1; i < nums.length;i++) {
	
	if(nums[i]>max) {
		max=nums[i];
	}
	
}
System.out.println(max);
		
	}

}
