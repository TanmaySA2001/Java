package onlineStoreManagementSystem;

public class Product {
	public String name;
	public int price;
	public int quantity;
	public double sum = 0;
	
	
	double calculateDiscount(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("The name of the product is: "+ this.name);
		System.out.println("The actual price of the product is: "+ this.price);
		System.out.println("The discount of this commodity is: 10%");
		System.out.println("Price after discount is: "+ (0.9*(this.price)));
		sum = sum + 0.9*(this.price);
		return 0.9*(this.price);
		
	}
	
	
}
