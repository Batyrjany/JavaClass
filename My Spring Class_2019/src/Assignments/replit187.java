package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class replit187 {

	public static void main(String[] args) {
		
		ArrayList<String> wordList= new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));
		String targetWord = "hi";
removeAll(wordList,targetWord);
	}
public static void removeAll(ArrayList<String>wordList,String targetWord){
	
	
	
	
	
	for (int i = 0; i < wordList.size(); i++) {
		if ( wordList.get(i).equals(targetWord)){
			wordList.remove(i);
			i--;	}
	
	}
	
	System.out.println(wordList);
	
	
	
	

}
}
