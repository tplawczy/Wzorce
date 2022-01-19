
package prototype;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestFailure {

	@Test
	public final void TestOriginalTransmissionAfterClone() {
		Transmission transmission = new Transmission(3, "Manual");
		Engine engine = new Engine();
		engine.setTransmission(transmission);
		engine.setFueltype("diesel");
		Car car = new Car();
		car.setEngine(engine);
		car.setDoors(4);
		car.setPower(68);
		Car cloned;

		try {
			cloned = (Car) car.clone();
			cloned.getEngine().setFueltype("benzine");
			cloned.getEngine().getTransmission().setGear(5);
			cloned.getEngine().getTransmission().setType("Automatic");
			cloned.setPower(34);

		} catch (CloneNotSupportedException e) {
		}

		Assert.assertEquals(3, car.getEngine().getTransmission().getGear());
		Assert.assertEquals("Manual", car.getEngine().getTransmission().getType());

	}

	@Test
	public final void TestOriginalEngineAfterClone() {

		Transmission transmission = new Transmission(3, "Manual");
		Engine engine = new Engine();
		engine.setTransmission(transmission);
		engine.setFueltype("diesel");
		Car car = new Car();
		car.setEngine(engine);
		car.setDoors(4);
		car.setPower(68);
		Car cloned;

		try {
			cloned = (Car) car.clone();
			cloned.getEngine().setFueltype("benzine");
			cloned.getEngine().getTransmission().setGear(5);
			cloned.getEngine().getTransmission().setType("Automatic");
			cloned.setPower(34);

		} catch (CloneNotSupportedException e) {
		}

		Assert.assertEquals("diesel", car.getEngine().getFueltype());

	}

}
