package busaf.dealer;

import busaf.bus.Bus;
import busaf.bus.Citybus;
import busaf.bus.IntercityBus;
import busaf.bus.MilitaryBus;
import busaf.equipmentfactory.ScandinavianBusEquipmentFactory;
import busaf.equipmentfactory.BusEquipmentFactory;

public class ScandinaviaBusDealer extends BusDealer {

	protected Bus createBus(String item) {
		Bus bus = null;
		BusEquipmentFactory busEquipmentFactory = new ScandinavianBusEquipmentFactory();

		if (item.equals("city")) {

			bus = new Citybus(busEquipmentFactory);
			bus.setName("Citybus for Scandinavian market");

		} else if (item.equals("intercity")) {

			bus = new IntercityBus(busEquipmentFactory);
			bus.setName("Intercitybus for Scandinavian market");

		} else if (item.equals("military")) {
			bus = new MilitaryBus(busEquipmentFactory);
			bus.setName("Militarybus for Scandinavian market");
		}
		return bus;

	}
}