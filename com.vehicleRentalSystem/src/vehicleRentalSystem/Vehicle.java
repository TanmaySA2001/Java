package vehicleRentalSystem;

public abstract class Vehicle {
	int model;
	int baseRate;
	
	abstract void CalculateRental(int model, int hours);
}
