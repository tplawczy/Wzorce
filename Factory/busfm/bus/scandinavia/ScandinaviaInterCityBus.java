package busfm.bus.scandinavia;

import busfm.bus.Bus;

public class ScandinaviaInterCityBus extends Bus  {
	public ScandinaviaInterCityBus() {
		name = "Intercity Bus for scandinavian market";
		aircondition = "Bas has A/C with enhanced heating -Vebasto ";
		wheels = "Bas has winter wheels ";
		engine = "Bas has hybrid engine ";

		features.add("Bus has normal floor");
		features.add("Bus's length is midi");
		features.add("Bus has navigation");
		features.add("Bud has cofee express");
		features.add("Bud has WC");
	}

	public void paint() {
		System.out.println(" Bus is painted with dark colours");
	}

}
