package buss;

public class SimpleBusFactory {

	public Bus createBus(String type) {
		Bus bus = null;

		if (type.equals("Intercitybus")) {
			bus = new Intercitybus();
		} else if (type.equals("Citybus")) {
			bus = new Citybus();
		} else if (type.equals("Shuttlebus")) {
			bus = new Shuttlebus();

		}
		return bus;
	}
}
