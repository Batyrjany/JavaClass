package day49;

public class WarmUp {

	
		/*INHERITANCE
		 * 
		 * public Computers extends Electronics{
		 * }
		 * 
		 * what is inherited from super class
		 * 
		 * All visible members(fields and methods) from super class
		 * constructor is not inherited
		 * 
		 * ACCESS MODIFIER:
		 * 
		 * private  ------- same class only
		 * default  ------- same package only
		 * protected------- same package + sub classes outside the package
		 * public   ------- everywhere
		 * 
		 * 
		 */
	public static void main(String[] args) {
		
		
		
		 AudioBook a1 = new AudioBook();
		    a1.author = "Java";
		    a1.audioLengt = 3; 
		    a1.chapterCount = 7 ; 
		    a1.pageCount = 300 ; 
		    a1.price = 12.99;
		    a1.printAuthor();
		    a1.play();
		    
		    PaperBook p1 = new PaperBook();
		    p1.author = "Suzanne Collins";
		    p1.name = "song of ice and fire"; 
		    p1.chapterCount = 34;
		    p1.weight = 0.750;
		    p1.hardcover = true;
		    p1.printAuthor();
		    p1.bookName();

	}

}
