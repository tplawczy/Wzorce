package prototyp;

public class Main {

	public static void main(String[] args) {
		final Vehicle vehicle = new VehicleBuilder().setEngine(new Engine("diesel")).createVehicle();

		System.out.println("vehicle=" + vehicle);
		try {
			System.out.println("clone=" + vehicle.clone());
		} catch (CloneNotSupportedException e) {
			System.err.println(e);
			throw new RuntimeException(e);
		}
	}
}
