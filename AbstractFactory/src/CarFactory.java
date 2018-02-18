
public class CarFactory extends VehicleFactory {
	public  Vechicle getVehicle() {
		return new Car(4);
	}
	
	public  Warranty getWarranty() {
		return new sixYears();
	}
	
}
