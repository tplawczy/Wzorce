package buss;

public class BusTestDrive {
	public static void main(String[] args) {
		SimpleBusFactory factory = new SimpleBusFactory();
		BusDealer store = new BusDealer(factory);

		Bus bus = store.orderBus("Citybus");
		System.out.println("We ordered a " + bus.getName() + "\n");

		bus = store.orderBus("Intercitybus");
		System.out.println("We ordered a " + bus.getName() + "\n");
	}
}
