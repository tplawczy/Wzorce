package busaf.dealer;

import busaf.bus.Bus;

public abstract class BusDealer {

	protected abstract Bus createBus(String item);

	public Bus orderBus(String type) {
		Bus bus = createBus(type);
		System.out.println("--- Making a " + bus.getName() + " ---");
		bus.prepareProduction();
		bus.assemble();
		bus.test();
		bus.produce();
		return bus;
	}

}
