package busfm.dealer;

import busfm.bus.Bus;
import busfm.bus.africa.AfricaCityBus;
import busfm.bus.africa.AfricaInterCityBus;
import busfm.bus.africa.AfricaMilitaryBus;
import busfm.bus.scandinavia.ScandinaviaCityBus;
import busfm.bus.scandinavia.ScandinaviaInterCityBus;
import busfm.bus.scandinavia.ScandinaviaMilitaryBus;

public class ScandinaviaBusDealer extends BusDealer {

	Bus createBus(String item) {
		if (item.equals("city")) {
			return new ScandinaviaCityBus();
		} else if (item.equals("intercity")) {
			return new ScandinaviaInterCityBus();
		} else if (item.equals("military")) {
			return new ScandinaviaMilitaryBus();
		} else
			return null;

	}
}
