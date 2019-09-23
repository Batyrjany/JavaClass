package Assignments;

import java.util.*;

public class replit186 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> wordList1 = new ArrayList<>();
		ArrayList<String> wordList2 = new ArrayList<>();
		wordList1.add("asd");
		wordList1.add("wer");
		wordList2.add("dfg");
		wordList2.add("klk");
		
		System.out.println(wordList1);
		System.out.println(wordList2);
   System.out.println("--------");
		System.out.println(combineAL(wordList1,wordList2));
	}

	
	public static ArrayList<String> combineAL(ArrayList<String> wordList1,ArrayList<String> wordList2)
	{
		
		ArrayList<String> list1	 = new ArrayList<>(wordList1);
		ArrayList<String> list2	 = new ArrayList<>(wordList2);
//		for (int  i = 0; i < wordList1.size(); i++) {
//			comby.add(wordList1.get(i));
//					
//		}
//		for (int  j = 0 ; j < wordList2.size(); j++) {
//			comby.add(wordList2.get(j));
//					
//	
//		}
//	
//		return comby;
		
		
		list1.addAll(list2);
		
	return list1;
	}
}

