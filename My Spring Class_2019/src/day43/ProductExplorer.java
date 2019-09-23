package day43;

public class ProductExplorer {

	public static void main(String[] args) {
	

		Product p1 = new Product();
		
		p1.initializeAllFieldsValue("Watch", 4.5f, 113.39, "x123");
		
		System.out.println( p1.getName());
		System.out.println( p1.getRating());
		System.out.println( p1.getPrice());
		System.out.println( p1.getProductId());
	
		
		
		p1.setPrice(113.39 - 20);
		System.out.println( p1.getPrice());
		
		
		System.out.println("--------");
		
		String productInfo = "Bag, 4.9, 399.99, gucci";
		
		String[] productSplitted =productInfo.split(", ");
		
		
        String productName = productSplitted[0];
        float productRating = Float.parseFloat(productSplitted[1]);
        double productPrice = Double.parseDouble(productSplitted[2]);
        String productId = productSplitted[3];
		
        
        
		Product p2 = new Product();
		
		p2.initializeAllFieldsValue(productName, productRating, productPrice, productId);

		System.out.println( p2.getName());
		System.out.println( p2.getRating());
		System.out.println( p2.getPrice());
		System.out.println( p2.getProductId());
		}

}
