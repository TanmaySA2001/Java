package vehicleRentalSystem;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose your respective vehicle");
		System.out.println("1 for Car");
		System.out.println("2 for Bike");
		System.out.println("3 for Truck");
		int choice = sc.nextInt();
		
		
		
		if(choice == 1) {
			System.out.println("Car");
			System.out.println("Choose your respective model");
			System.out.println("1 for Sedan");
			System.out.println("2 for Others");
			int model = sc.nextInt();
			System.out.println("Choose your duration of travel");
			int duration = sc.nextInt();
			Car c = new Car();
			c.CalculateRental(model, duration);
		}
		else if(choice == 2) {
			System.out.println("Bike");
			System.out.println("Choose your respective model");
			System.out.println("1 for Sports");
			System.out.println("2 for Others");
			int model = sc.nextInt();
			System.out.println("Choose your duration of travel");
			int duration = sc.nextInt();
			Bike b = new Bike();
			b.CalculateRental(model, duration);
		}
		else if(choice == 3){
			System.out.println("Truck");
			System.out.println("Choose your respective model");
			System.out.println("1 for Volvo");
			System.out.println("2 for Others");
			int model = sc.nextInt();
			System.out.println("Choose your duration of travel");
			int duration = sc.nextInt();
			Truck t = new Truck();
			t.CalculateRental(model, duration);
		}
	}
}
