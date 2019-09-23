package day53;

//public final class Computer {
public class Computer {

public final void systemPolicy() {
  System.out.println("DO NOT CHANGE THIS POLICY");
}

public final static void staticSystemPolicy() {
  System.out.println("DO NOT CHANGE THIS STATIC POLICY");
}

public static void main(String[] args) {
  
  final int x = 100 ; 
  
  // How many place a variable can show up 
  
  /*
   * inside a method --->>> local variavle 
   * 
   * on method header inside (..)  --->>> method parameters 
   * 
   * under the class outisde any method or block ----> field   
   * 
   * 
   * */
  
  
}


}


class MacBook extends Computer{

//@Override  THIS DOES NOT WORK CAN NOT OVERRIDE FINAL METHOD 
//public void systemPolicy() {
//  System.out.println("HAHA I AM JUST REBELLIOS " );
//}
// CAN NOT HIDE FINAL STATIC METHOD
//public static void staticSystemPolicy() {
//  System.out.println("HAHA I AM JUST REBELLIOS " );
//}

}

