package day33;

public class warmUpOptional {

	public static void main(String[] args) {
		
//		Optional : 
//			   * create a method that take one String parameter as sentence 
//			   * return first character for 
//			   * first word and all characters of last word except first char
//			   * example : Love Java --> Lava 
		
		
		String sentence = "Love java";
		
		System.out.println(getMyString(sentence));
	}

	public static String getMyString(String sentence) {
		String firstChar = sentence.substring(0, 1);
		String [] allWords = sentence.split(" ");
		String lastWord = allWords[allWords.length-1];
		
		String targetWord = firstChar+lastWord.substring(1);
		
		//System.out.println(targetWord);
		return targetWord;
		
	}
	
	
	
	
}
