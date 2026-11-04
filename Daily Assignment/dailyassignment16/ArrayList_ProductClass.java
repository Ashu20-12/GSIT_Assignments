package dailyassignment16;

import java.util.ArrayList;

class Product
{
	int productId;
	String productName;
	double price;
	int quantity;
	Product(int productID , String productName , double price , int quantity)
	{
		this.productId = productID;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
}

public class ArrayList_ProductClass {

	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		Product p1 = new Product(101,"Laptop",55000,5);
		Product p2 = new Product(102,"Mouse",800,10);
		Product p3 = new Product(103,"Keyboard",1500,0);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println("Product_ID"+" Product_Name"+" Price"+" Quantity");
		for(Product p :  list)
		{
			System.out.println(p.productId+"    "+p.productName+"     "+p.price+"     "+p.quantity);
		}
		
		System.out.println();
		System.out.println("Products whose quantity is less than 5 : ");
		for(Product p :  list)
		{
			if(p.quantity<5)
				System.out.println(p.productName);
		}
		
		System.out.println();
		Product expensive = list.get(0);
		for(Product p :  list)
		{
			if(p.price > expensive.price)
			{
				expensive = p;
			}
		}
		System.out.println("Most expensive product");
		System.out.println(expensive.productName +" "+expensive.price);
		
		System.out.println();
		
		double total_inventory =0;
		for(Product p :  list)
		{
			total_inventory += (p.price * p.quantity);
		}
		System.out.println("Total Inventory : " +total_inventory);
		System.out.println();
		
		for(Product p :  list)
		{
			if(p.productName == "Mouse")
			{
				p.price = 1000;
			}
		
		}
		System.out.println("Mouse price updated");
		
		for(Product p :  list)
		{
			System.out.println(p.productId+"    "+p.productName+"     "+p.price+"     "+p.quantity);
		}
		
		System.out.println();
		
		list.removeIf(p -> p.quantity == 0); // removeIF is a function and the lambda 
		System.out.println("Product removed whose quantity is 0");
		System.out.println();
		System.out.println("Final Product list : ");
		for(Product p :  list)
		{
			System.out.println(p.productId+"    "+p.productName+"     "+p.price+"     "+p.quantity);
		}
		
		
		
		
		
	}

}
