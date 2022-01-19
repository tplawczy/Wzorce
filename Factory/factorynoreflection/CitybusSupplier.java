package factorynoreflection;

import java.util.function.Supplier;

import buss.Bus;
import buss.Citybus;

public class CitybusSupplier implements Supplier<Bus> {

	@Override
	public Citybus get() {
		return new Citybus();
	}
}
