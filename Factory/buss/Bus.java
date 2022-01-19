package buss;

import java.util.ArrayList;

abstract public class Bus {
 String name;
	String floor;
	String length;
	String engine;

	ArrayList features = new ArrayList();

	public String getName() {
		return name;
	}

	public void prepareProduction() {
		System.out.println("Preparing " + name);
	}

	public void assemble() {
		System.out.println("Assembling " + name);
	}

	public void test() {
		System.out.println("Testing " + name);
	}

	public String toString() {

		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(floor + "\n");
		display.append(length + "\n");
		display.append(engine + "\n");
		for (int i = 0; i < features.size(); i++) {
			display.append((String) features.get(i) + "\n");
		}
		return display.toString();
	}

}
