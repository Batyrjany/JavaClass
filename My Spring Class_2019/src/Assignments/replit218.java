package Assignments;

import java.util.*;

public class replit218 {

	/**
     * Constructor is made private to prevent any instantiation.
     * Since all methods in this class are static that can be called
     * without an object
     */
    private replit218() {
      //nothing todo here. 
    }

    /**
     * List<Book> theBooks will hold all book object in the shelf
     * in form of a List of Book objects
     */
    private static List<Book> theBooks = new ArrayList<>();

    /**
     * public static getter method for theBooks list
     * @return theBooks
     */
    public static List<Book> getTheBooks() {
       
    	return theBooks;
    }

    /**
     * isShelfEmpty is used to see if shelf is empty or not.
     * Shelf is empty when List<Book> theBooks has no Book objects added
     *
     * @return true if list is empty or false if not
     */
    public static boolean isShelfEmpty(){
       
    	return theBooks.isEmpty();
    	}

    /**
     * isIDUnique accepts an id and loops though each Book object in theBooks list
     * and if id was already assigned to another book, it will return false
     * If id was never used, it will return true
     * @param id
     * @return true or false
     */
    public static boolean isIDUnique(int id){
     for (int i = 0; i < theBooks.size(); i++) {
		
    	 if(theBooks.get(i).getId()== id){
    		return false; 
    	 }
    	 
	}
    	
    	return true;
     
    }


    /**
     * static addBook method is used to add a book to the Shelf. to List<Book> theBooks
     * @param id
     * @param author
     * @param title
     * @param pages
     * @returns true if Book was successfully added or false if not
     * Conditions:
     *     returns false and does NOT add a book to the list if:
     *      - id is not unique. was already used by other books. Call isIDUnique to check that
     *      - title is empty
     *      - pages <= 0
     *     returns true and adds a new Book object to List<Book> theBooks if:
     *      - all above checks passed.
     *      Shelf.addBook(100,"j.K. rowLing","harry potter",556); => returns true
     *      and adds the book to the list:
     *         theBooks.add(new Book(id,author,title,pages));
     */
    public static boolean addBook(int id, String author, String title, int pages ){
      
    	
    	
      return false;
    }

    /**
     * static addBook method is used to add a book to the Shelf. to List<Book> theBooks
     * @param  book object
     * @return true if Book was successfully added or false if not
       Conditions:
     *     returns false and does NOT add a book to the list if:
     *      - book.getId() is not unique. was already used by other books. Call isIDUnique to check that
     *      - book's title is empty
     *      - book's pages <= 0
     *     returns true and adds the Book object to List<Book> theBooks if:
     *      - all above checks passed.
     *
     *      Book book1, book2;
     *      book1 = new Book(44, "shel silverstein" ,"the Giving tRee",532);
     *      book2 = new Book(434, "Dan Brown" ,"the da Vinci coDe",1532);
     *
     *      Shelf.addBook(book1); => true
     *      Shelf.addBook(book1); => true
     *
     */
    public static boolean addBook(Book book ){
        
        
    	
    	return false;
    }

    /**
     * static getTitleByID method looks up title of the Book by id
     * @param id
     * @return title
     * Loop through each book in Shelf (the theBooks list) and if you find a book
     * matching id then return that book's title
     * Ex:
     *  Assume we have Book id=100, title=Start With Why
     *  Shelf.getTitleByID(100); => "Start With Why"
     *  Shelf.getTitleByID(100534534); => "book not found"
     */
    public static String getTitleByID(int id) {
        
        
    	
    	return null;
    }

    /**
     * static method findBookByPartialTitle
     * Looks for a book and if title parameter matches partially
     * return that book object.
     * @param title: partial string to match
     * @return Book object
     *
     * Assume we have Book id=100, title=Start With Why, Author: Simon Sinek
     *    Shelf.findBookByPartialTitle("start"); => returns that Book object
     *    Shelf.findBookByPartialTitle("why"); => returns that Book object
     *    Shelf.findBookByPartialTitle("Wooden Spoon); returns null
     *
     */
    public static Book findBookByPartialTitle(String title) {
       
       
    	
    	return null;
    }

    /**
     * static method getAllBooksForAuthor.
     * Loops through each book in shelf(theBooks list) and returns
     * a new List<Book> objects for that author.
     * If no book is found for that author, returns an empty list
     * @param author
     * @return List<Book> that belongs to that Author
     */
    public static List<Book> getAllBooksForAuthor(String author) {
       
       
    	return null;
    }

    /**
     * static removeBook method removes the Book from the Shelf(theBooks list)
     * @param id
     * Look for the book in the theBooks list that matches the id and remove it
     * if there is not match, no action needed
     */
    public static void removeBook(int id) {
       
       
    }

    /**
     * static removeBook method removes the Book from the Shelf(theBooks list)
     * @param author
     * Look for the book in the theBooks list that matches the author and remove ALL of matches
     * if there is not match, no action needed
     */
    public static void removeBook(String author) {
    
    
    }

    /**
     * Clears the BookShelf of all books
     */
    public static void clearBookShelf() {
       
       
    }


}
   class Book {
    //instance variables for Book object
    private String author;
    private String title;
    private int id;
    private int pages;
    //static variable to track number of books with unknown author
    private static int unknownAuthors;

    /**
        Utility static method: capitalize
        accepts a String and then returns in capitalized form(first uppercase - rest lowecase)
        if argument is empty, it returns an empty String ""
        capitalize("jAVa") => "Java"
        capitalize("HTML") => "Html"
        capitalize("") => ""
        This method will be used in setAuthor(), setTitle() methods
     */
    public static String capitalize(String word) {
		
    	String cap= "";
    	for (int i = 0; i < word.length(); i++) {
			if(word.isEmpty()) {
				cap="";
			}else {
				
				if(word.charAt(i)==' ')
				cap+=word.valueOf(0).toUpperCase()+word.substring(1, word.length()).toLowerCase();
			}
		}
    	
    	return cap;
    }

    /**
      Utility static method: isTitleWord
      -This method will be used in setTitle() method
      -Accepts a words to check if it is a part of the title or just an article etc.
      - The method returns false => if word parameter is one of articles, coordinate conjunctions, or prepositions. See full list below
      -else method returns true
      Articles:
     "a" , "an", "the"
      Coordinate conjunctions:
     "and", "but", "for", "nor", "or", "so", "yet"
     Most common single-word English prepositions:
     "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"

     isTitleWord("Apple") => true
     isTitleWord("a") => false
     isTitleWord("BUT") => false
     isTitleWord("THE") => false
     isTitleWord("neaR") => false
     isTitleWord("java") => true

     */
    public static Boolean isTitleWord(String word) {
    	 String[] articles = { "a" , "an", "the", "and", "but", "for", "nor", "or", "so", "yet", "at", "by", "in", "into", "near", "of", "on", "to", "than", "via"};
    	    
    	 boolean b = true;
    	 for (int i = 0; i < articles.length; i++) {
			if(articles[i].equalsIgnoreCase(word)) {
				b= false;
		
			}else {				
				b=true;
			}
		}
    	return b;     
    }

    /**
     * No args constructor. Stays empty
     */
    public Book() {
    }

    /**
     * 4 args constructor. accepts id, author, title, pages
     * CALLS SETTER methods to assign to instance variables.
     * ex: setId(id);
     * It does NOT directly assign to the instance variable
     * ex: NO => this.id = id;
     */
    public Book(int id, String author, String title, int pages ) {
       
       this.id=id;
       this.author=author;
       this.title=title;
       this.pages=pages;
       
    }

    /**
     * setAuthor method will be used to set value to private author of the Book
     * @param author : String
     * Conditions:
     *    => if parameter author is value is empty, 1) "Unknown" is assigned to instance variable author
     *                                             2) static unknownAuthors is incremented by one.
     *    => Each word in Book author's name should be capitalized. CALL capitalize method
     *  Example:
     *  Book b = new Book();
     *  b.setAuthor("mArufJon temirov"); => assigns "Marufjon Temirov" to this.author
     *  b.setAuthor("ironMAN"); => assigns "Ironman" to this.author
     *  b.setAuthor("") => assigns "Unknown" to this.author and unknownAuthors++
     */
    public void setAuthor(String author) {
       if(author.isEmpty()) {
    	   this.author= "Unknown";
    	   unknownAuthors++;
       }else
    	  this.author= capitalize(author);
   
        
    }

    /**
     * setTitle method will be used to set value to private title of the Book
     * @param title : string
     * Conditions:
     *   => if title is single word, capitalize it and assign to this.title.
     *   => if title is empty, assign "" to this.title (<- we will handle this in Shelf class properly)
     *   => You need to capitalize each word of title except articles, coordinate conjunctions, or prepositions.
     *              See full list in isTitleWord method, they need to be all lowercase.
     *              -> Call isTitleWord() method to check if a word needs to be capitalized or not.
     *              -> Call capitalize method to capitalize title words.
     *   => First word is always capitalized regardless if it is article etc.
     *   Ex:
     *      Book book = new Book();
     *      book.setTitle("MaruF The cool"); => "Maruf the Cool" is assigned to this.title
     *
     *      book.setTitle("the Chronicles OF TrumP"); => "The Chronicles of Trump" is assigned to this.title
     *
     *
     */
    public void setTitle(String title) {
    	if(title.isEmpty()) {
            this.title = "";
          } else {
            String[] arr = title.toLowerCase().split(" ");
            String str = capitalize(arr[0]) + " " ;
            if(arr.length>1) {
              for(int i=1; i<arr.length; i++) {
                if(isTitleWord(arr[i])) {
                  arr[i]=capitalize(arr[i]);
                }
                str += arr[i] + " ";
              }
            }
            this.title = str.substring(0, str.length()-1);
          }

    }

    /**
     * toString instance method, String representation of the Book object
     * @return String
     * Format includes author, title, id, pages of the Book object:
     * Book[author=Marufjon T, title=Selenium Cookbook, id=10, pages=300]
     */
    public String toString() {
    	
       
       return "Book[author= "+this.author+" title= "+this.title+" id= "+ this.id+" pages= "+this.pages+ " ]";
       
    }


    /**
     * Getter methods for static unknownAuthors
     * @returns unknownAuthors value
     */
    public static int getUnknownAuthors(){
       
       
       return unknownAuthors;
    }

    /**
     * Getter methods for private pages
     * @returns pages value
     */
    public int getPages() {
       
       
       return pages;
    }

    /**
     * Setter method for private pages. No conditions
     * @param pages
     */
    public void setPages(int pages) {
      
      this.pages=pages;
      
    }

    /**
     * public Getter method for private author
     */
    public String getAuthor() {
      
      return author;
    }


    /**
     * public Getter method for private title
     */
    public String getTitle() {
       
       
       return title;
    }


    /**
     * public Getter method for private id
     */
    public int getId() {
      
      
      return id;
    }
    /**
     * public setter method for private id
     */
    public void setId(int id) {
       this.id=id;
       
       
    }
public static void main(String[] args) {
	
	
	
	
}

}

