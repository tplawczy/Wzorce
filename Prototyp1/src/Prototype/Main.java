package prototype;

public class Main {

	public static void main(String[] args) {
		Transmission transmission = new Transmission(3, "Automatic");
		Engine engine = new Engine();
		engine.setTransmission(transmission);
		engine.setFueltype("diesel");
		Car car = new Car();
		car.setEngine(engine);
		car.setDoors(4);
		car.setPower(68);
		Car cloned;

		System.out.println(car);
		try {cloned=(Car)car.deepclone();
			cloned.getEngine().setFueltype("benzine");
			cloned.getEngine().getTransmission().setGear(5);
			cloned.getEngine().getTransmission().setType("Manual");
			cloned.setPower(34);
				System.out.println("clone=" + cloned);
			
			} catch (CloneNotSupportedException e) {
		}
		System.out.println(car);
	}
}
