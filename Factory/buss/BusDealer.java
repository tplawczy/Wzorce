package buss;



public class BusDealer {
	SimpleBusFactory factory;
	 
	public BusDealer(SimpleBusFactory factory) { 
		this.factory = factory;
	}
 
	public Bus orderBus(String type) {
		 Bus bus;
 
		bus = factory.createBus(type);
 
//      bus.prepareProduction();
//		bus.assemble();
//		bus.test();
	

		return bus;
	}
}
