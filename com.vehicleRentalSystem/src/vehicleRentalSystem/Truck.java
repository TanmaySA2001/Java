package vehicleRentalSystem;

public class Truck extends Vehicle{
	
	void CalculateRental(int model, int hours) {
		if(model == 1) {
			this.baseRate = 5000;
			System.out.println("The amount is: "+ baseRate*hours);
		}
		else {
			this.baseRate = 4500;
			System.out.println("The amount is: "+ baseRate*hours);
		}
	}
}
