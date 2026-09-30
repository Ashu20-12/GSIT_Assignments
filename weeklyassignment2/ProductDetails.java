package assignment1;

public class ProductDetails {

	public static void main(String[] args) {
		float productPrice = 499.50f;
        int quantity = 3;

        float totalPrice = productPrice * quantity;

        System.out.printf("Product Price: %.2f%n", productPrice);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Price: %.2f%n" , totalPrice);      // %.2f%n" : this is specially used when we have to perform any 
                                                                    //special formatting 

	}

}
