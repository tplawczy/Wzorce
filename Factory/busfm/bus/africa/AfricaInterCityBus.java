package busfm.bus.africa;

import busfm.bus.Bus;

public class AfricaInterCityBus extends Bus {

	public AfricaInterCityBus() {
		name = "Intercity Bus for african market";
		aircondition = "Bas has A/C with enhanced Cooler ";
		wheels = "Bas has summer wheels ";
		engine = "Bas has diesel engine ";

		features.add("Bus has normal floor");
		features.add("Bus's length is midi");
		features.add("Bus has navigation");
		features.add("Bud has cofee express");
		features.add("Bud has WC");
	}
	public void paint() {
		System.out.println(" Bus is painted with bright colours");
	}

}
