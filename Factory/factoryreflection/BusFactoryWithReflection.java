package factoryreflection;

import java.lang.reflect.Constructor;
import java.net.Proxy.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import buss.Bus;
import buss.Citybus;
import buss.Intercitybus;
import buss.SimpleBusFactory;

public class BusFactoryWithReflection {

	private Map<String, Class<? extends Bus>> registeredBusTypes = new ConcurrentHashMap<>();

	private static BusFactoryWithReflection INSTANCE;

	private BusFactoryWithReflection() {
	}

	public static BusFactoryWithReflection instance() {
		if (INSTANCE == null) {
			INSTANCE = new BusFactoryWithReflection();
		}
		return INSTANCE;
	}

	public void registerBus(String type, Class<? extends Bus> busClass) {
		this.registeredBusTypes.put(type, busClass);
	}

	public Bus createBus(String type) {
		if (type == null) {
			throw new IllegalArgumentException("type cannot be null");
		}
		Class<? extends Bus> busClass = registeredBusTypes.get(type);
		if (busClass == null) {
			throw new RuntimeException("Car type not registered: " + type);
		}
		try {
			Constructor<? extends Bus> busConstructor = busClass.getDeclaredConstructor();
			return busConstructor.newInstance();
		} catch (Exception e) {
			throw new RuntimeException("Car of type " + type + " cannot be instantiated", e);
		}
	}

}
