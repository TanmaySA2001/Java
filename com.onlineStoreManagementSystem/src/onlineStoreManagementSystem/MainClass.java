package onlineStoreManagementSystem;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Electronics e = new Electronics();
		e.calculateDiscount("TV", 25000);
		
		//String name = System.console().readLine();
		System.out.println("");
		Clothing c = new Clothing();
		c.calculateDiscount("Joggers", 2000);
		System.out.println("");
		Grocery g = new Grocery();
		g.calculateDiscount("Wheat Flour", 2000);
		System.out.println("");
		Product p = new Product();
		p.calculateDiscount("Toys", 500);
		
		
	    
		
	}
	
	
}
