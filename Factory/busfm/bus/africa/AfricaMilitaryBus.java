package busfm.bus.africa;

import busfm.bus.Bus;

public class AfricaMilitaryBus extends Bus {
	
	public AfricaMilitaryBus() {
		name = "Military Bus for african market";
		aircondition = "Bas has A/C with enhanced Cooler ";
		wheels = "Bas has summer wheels ";
		engine = "Bas has diesel engine ";

		features.add("Bus has normal floor");
		features.add("Bus's length is midi");
		features.add("Bus armoured glass");
		features.add("Bus armoured carossery");
		features.add("Bus has a machine gun");
	}

	public void paint() {
		System.out.println(" Bus is painted with dark colours");
	}

}
