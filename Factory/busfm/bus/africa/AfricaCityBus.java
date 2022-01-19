package busfm.bus.africa;

import busaf.equipment.accessory.EnhancedCooling;
import busaf.equipment.accessory.TintedWindows;
import busfm.bus.Bus;

public class AfricaCityBus extends Bus {
	public AfricaCityBus() {

		name = "City Bus for african market";
		aircondition = "Bas has A/C with enhanced Cooler ";
		wheels = "Bas has summer wheels ";
		engine = "Bas has diesel engine ";

		features.add("Bus has low floor");
		features.add("Bus is long");
	}

	public void paint() {
		System.out.println(" Bus is painted with bright colours");
	}

}