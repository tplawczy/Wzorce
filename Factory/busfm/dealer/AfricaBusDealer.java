package busfm.dealer;

import busfm.bus.Bus;
import busfm.bus.africa.AfricaCityBus;
import busfm.bus.africa.AfricaInterCityBus;
import busfm.bus.africa.AfricaMilitaryBus;

public class AfricaBusDealer extends BusDealer {

	Bus createBus(String item) {
		if (item.equals("city")) {
			return new AfricaCityBus();
		} else if (item.equals("intercity")) {
			return new AfricaInterCityBus();
		} else if (item.equals("military")) {
			return new AfricaMilitaryBus();
		} else
			return null;
	}
}