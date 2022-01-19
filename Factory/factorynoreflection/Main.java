package factorynoreflection;

import buss.Bus;
import buss.Citybus;
import buss.Intercitybus;
import factorynoreflection.BusFactoryNoReflection;

public class Main {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		BusFactoryNoReflection.instance().registerBus("Citybus",new CitybusSupplier());
		Bus bus2 = BusFactoryNoReflection.instance().createBus("Citybus");
		System.out.println(bus2);

	}
}
