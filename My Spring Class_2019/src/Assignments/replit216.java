package Assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class replit216 {

	
	
	 //private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     *
     * assigns to values to instance variables
     */
    public replit216(String name,int quantity,int catalogNumber, double price)
    {
      this.name=name;
      this.quantity=quantity;
      this.catalogNumber=catalogNumber;
      this.price=price;
      
    }

    /**
     * setter for name instance variable
     * @param name
     */
    public void setName(String name) {
       this.name =name;
    }

    /**
     * setter for private price
     * @param price
     */
    public void setPrice(double price) {
       this.price=price;
    }

    /**
     * getter for price
     * @return
     */
    public double getPrice() {
        
        return price;
    }

    /**
     * getter for name
     * @return
     */
    public String getName(){
      
      
        return name;
    }


    public int getQuantity(){
       //TODO
        return quantity;

    }
    public void setQuantity(int quantity){
         //TODO
this.quantity=quantity;
    }

    public int getCatalogNumber(){
      //TODO
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
       this.catalogNumber=catalogNumber;
       
    }

    /**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */
    @Override
    public String toString() {
        return "Item{name= "+name+ " catalogNumber= "+catalogNumber+" quantity= "+ quantity+ " price= "+ price+" }"; 
    }
  
}
class OnSaleItem extends replit216 {
    /**
     * private instance variable, used for discount percentage
     */
    private double discount;

    /**
     * public constructor for OnSaleItem
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     * @param discount
     *
     * - Calls Super class constructor by passing name,quantity,catalogNumber,price
     * - it will assign the price after deducting(minus) discount from the price
     * - assigns discount
     */
    public OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
      super(name,quantity,catalogNumber, price);
      this.discount=discount;
    }

    /**
     * getter for discount
     * @return
     */
    public double getDiscount() {
      //TODO
        return discount;
    }

    /**
     * setter for discount
     * @param discount
     */
    public void setDiscount(double discount) {
       this.discount=discount;
    }

    /**
     * overrides toString from Item:
     *
     * @returns Object description in this format:
     *      * "OnSaleItem{discount=20.0%, name=ItemName, price=100.45}"
     *
     */
    @Override
    public String toString() {
        return "OnSaleItem{discount= "+discount+" name= " +this.getName()+" price= "+this.getPrice()+"}";
    }
}
class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<replit216> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
    	regularItems=new ArrayList<>();
    	onSaleItems=new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(replit216 item) {
    	regularItems.add(item);
       
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        
    	onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */
    public List<replit216> getRegularItems() {
        //TODO change from null 
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
         //TODO change from null 
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
         //TODO change from -1 
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1 
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
       
    	
    	List<String> names = new ArrayList<>();
       for (int i = 0 ; i<regularItems.size(); i++) {
		names.addAll((Collection<? extends String>) regularItems.get(i));
	}
       for (OnSaleItem each1 : onSaleItems) {
		names.addAll((Collection<? extends String>) each1);
	}
       
       return names;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
       if(this.)
        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        
        
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
       
       
       
       
    }


}


