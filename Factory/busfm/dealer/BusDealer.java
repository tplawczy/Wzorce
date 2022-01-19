package busfm.dealer;

import busfm.bus.Bus;

public abstract class BusDealer {

	abstract Bus createBus(String item);

	public Bus orderBus(String type) {
		Bus bus = createBus(type);
/*		System.out.println("---Making a " + bus.getName() + " ---" + "\n" + bus);
		bus.prepare();
		bus.prepareProduction();
		bus.assemble();
		bus.test();
        bus.paint();*/
		return bus;
	}
}
