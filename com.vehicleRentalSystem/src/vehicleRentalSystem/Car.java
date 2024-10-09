package vehicleRentalSystem;

public class Car extends Vehicle{
	
	void CalculateRental(int model, int hours) {
		
		if(model == 1) {
			this.baseRate = 2200;
			System.out.println("The amount is: "+ baseRate*hours);
		}
		else {
			this.baseRate = 2000;
			System.out.println("The amount is: "+ baseRate*hours);
		}
	}
}
