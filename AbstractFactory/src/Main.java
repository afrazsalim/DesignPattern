
public class Main {
   public static void main(String [] args) {
	   VehicleFactory carF = new CarFactory();
	   Vechicle car = carF.getVehicle();
	   car.getNumberOfTires();
   }
   
   
}
