package busfm.bus.scandinavia;

import busfm.bus.Bus;

public class ScandinaviaCityBus extends  Bus {
	public ScandinaviaCityBus() {
		name = "City Bus for scandinavian market";
		aircondition = "Bas has A/C with enhanced heating -Vebasto ";
		wheels = "Bas has winter wheels ";
		engine = "Bas has hybrid engine ";

		features.add("Bus has low floor");
		features.add("Bus is long");
	}

	public void paint() {
		System.out.println(" Bus is painted with bright colours");
	}

}
