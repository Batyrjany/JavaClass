package day36;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysListIntro {

	
	  public static void main(String[] args) {
	        int i =10;
	        Scanner in = new Scanner(System.in);
	        
	        Double d = new Double ("2.14");
	        float f = 1.4f;
	        
	        //Create an  ArrayList object and assign it to list1
	        ArrayList list1 = new ArrayList();
	        
	        //Create an ArrayList object with no arg constructor
	        ArrayList<String> list2 = new ArrayList<String>();
	        ArrayList<String> list3 = new ArrayList<String>();
	        
	        
	        list1.add("Go");
	        list1.add("Snail");
	        list1.add("Mail");
	        list1.add("Go");
	        list1.add(new Integer(1));
	        list1.add(Character.valueOf('A'));
	        
	        System.out.println(list1);
	    }
	}