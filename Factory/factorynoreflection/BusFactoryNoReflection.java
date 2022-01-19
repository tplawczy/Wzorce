package factorynoreflection;

import java.util.HashMap;
import java.util.Map;
import buss.*;
import buss.Bus;
import java.util.function.Supplier;

public class BusFactoryNoReflection {

	private Map<String, Supplier<? extends Bus>> registeredBusTypes = new HashMap<>();

	private static BusFactoryNoReflection INSTANCE;

	public static BusFactoryNoReflection instance() {
		if (INSTANCE == null)
			INSTANCE = new BusFactoryNoReflection();
		return INSTANCE;
	}

	public void registerBus(String type, Supplier<? extends Bus> supplier) {
		registeredBusTypes.put(type, supplier);
	}

	public Bus createBus(String type) throws InstantiationException, IllegalAccessException {
		if (type == null) {
			throw new IllegalArgumentException("type cannot be null");
		}
		Supplier<? extends Bus> bus = registeredBusTypes.get(type);
		if (bus == null) {
			throw new RuntimeException("Car type not registered: " + type);
		}

		return bus != null ? bus.get() : null;

	}
}
