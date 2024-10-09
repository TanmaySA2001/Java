package vehicleRentalSystem;

public class Bike extends Vehicle{
	
	void CalculateRental(int model, int hours) {
		if(model == 1) {
			this.baseRate = 1500;
			System.out.println("Hii");
			System.out.println("The amount is: "+ baseRate*hours);
		}
		else {
			this.baseRate = 1000;
			System.out.println("The amount is: "+ baseRate*hours);
		}
		
	}
}
