
public class EncapsulationDemo {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.setVehicleNumber("npgs1518");
		vehicle.setModelName("cr27");
		vehicle.setManufacturingYear(1996);
		vehicle.setColor("white");
		vehicle.setCapacity(1300);
		
		System.out.println(vehicle.getVehicleNumber());
		System.out.println(vehicle.getModelName());
		System.out.println(vehicle.getManufacturingYear());
		System.out.println(vehicle.getColor());
		System.out.println(vehicle.getCapacity());
		
		System.out.println(vehicle.toString());
	}

}
