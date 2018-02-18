
public class BikesFactory extends VehicleFactory {
	public  Vechicle getVehicle() {
		return new Bike(2);
	}
	
	public  Warranty getWarranty() {
		return new threeYears();
	}

}
