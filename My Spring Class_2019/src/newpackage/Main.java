package newpackage;


import java.util.Scanner;

public class Main {
  //YOUR CODE HERE 
  public static void main(String[] args){
  
   Scanner scan = new Scanner(System.in);
   
  int areaCode,localNumber;
  String phoneNumber;
  phoneNumber ="("+areaCode+")-"+localNumber;
  
  areaCode =scan.nextInt();
  
  localNumber =scan.nextInt();
  
  System.out.println("Calling number"+" "+phoneNumber);
  
}
}
Collapse



Message Input
