package onlineStoreManagementSystem;

public class Grocery extends Product{
	
	@Override
	double calculateDiscount(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("The name of the product is: "+ this.name);
		System.out.println("The actual price of the product is: "+ this.price);
		System.out.println("The discount of this commodity is: 25%");
		System.out.println("Price after discount is: "+ (0.75*(this.price)));
		sum = sum + 0.75*(this.price);
		return 0.75*(this.price);
	}
}
