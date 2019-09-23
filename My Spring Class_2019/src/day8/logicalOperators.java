package day8;

public class logicalOperators {

	public static void main(String[] args) {
		
		//Logical AND operator &&
		//Logical OR operator ||
		//Logical NOT operator !
		
	/*	int a = 10, b = 20, c = 10;
		
		boolean b1 = a>b;
		boolean b2 = a>=c;
	
		System.out.println("a is more than b "+ b1);
        System.out.println("a is more or equal to c "+b2);		
        System.out.println("are both conditions met "+(b1 && b2));		
		
		*/
		
		/*boolean isHungry = true;
		boolean isBreakTime = true;
		boolean isYourLunchReady = true;
		
		System.out.println("are you hungry and is it break time "+ (isHungry && isBreakTime));
		System.out.println("are you hungry or is it break time "+ (isHungry || isBreakTime));
		
		boolean  reverseIsHungry = ! isHungry; 
		System.out.println("original isHungry  "+ isHungry);
		System.out.println("After reversing isHungry "+ reverseIsHungry);
		
		boolean areWeSuperReady = isHungry && isBreakTime && isYourLunchReady;
		
		System.out.println("hungry, break time, meal is ready "+areWeSuperReady);
		*/
		/*System.out.println("result of true && true " +(true && true));
		System.out.println("result of true && false " +(true && false));
		System.out.println("result of false && true " +(false && true));
		System.out.println("result of false && fasle " +(false && false));
		
		
		System.out.println("result of true || true " +(true || true));
		System.out.println("result of true || false " +(true || false));
		System.out.println("result of false || true " +(false || true));
		System.out.println("result of false || fasle " +(false || false));
		
		System.out.println("result of !true " +!true);
		System.out.println("result of !fasle " +!false);
		 */
		
		int score = 10;
		boolean result1 = score > 4;
		boolean result2 = score > 4 && score < 11;
		boolean result3 = score > 14 && score < 11;
		boolean result4 = score > 14 || score < 11;
		//boolean result5 = score++ > 10 || score < 12;
		//boolean result5 = score > 10 || score < 12;
		boolean result5 = score > 11 && ++score < 10;
		
		//boolean result5 = score++ > 10 && ++score < 13;//it will not evaluate the next one as long 
		//as first variable is false
		//boolean result5 = score++ > 10 & ++score < 13;// in this case there is one & so it will evaluate next score appear again
		//boolean result5 = score > 10 & ++score < 13;
		
		
		System.out.println("result is "+ result1);
		System.out.println("result is "+ result2);
		System.out.println("result is "+ result3);
		System.out.println("result is "+ result4);
		System.out.println("result is "+ result5);
		System.out.println("The value of score is "+ score);
		
		
		
		
		
		
		
	}

}
