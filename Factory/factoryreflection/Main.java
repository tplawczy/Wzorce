package factoryreflection;

import buss.Bus;
import buss.Intercitybus;

public class Main {
	static {
		try {
			Class.forName("buss.Intercitybus");

		} catch (ClassNotFoundException any) {
			any.printStackTrace();
		}
	}

	public static void main(String[] args) {

		BusFactoryWithReflection.instance().registerBus("Intercitybus", Intercitybus.class);
		Bus bus2 = BusFactoryWithReflection.instance().createBus("Intercitybus");
		System.out.println(bus2);

	}

}
