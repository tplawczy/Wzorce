package busfm.bus.scandinavia;

import busfm.bus.Bus;

public class ScandinaviaMilitaryBus extends Bus {
	public ScandinaviaMilitaryBus() {
		name = "Military Bus for scandinavian market";
		aircondition = "Bas has A/C with enhanced heating -Vebasto ";
		wheels = "Bas has winter wheels ";
		engine = "Bas has hybrid engine ";

		features.add("Bus has normal floor");
		features.add("Bus's length is midi");
		features.add("Bus armoured glass");
		features.add("Bus armoured carossery");
		features.add("Bus has a machine gun");
	}

	public void paint() {
		System.out.println(" Bus is painted with brown colours");
	}

}
