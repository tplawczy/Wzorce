package busfm.bus;

import java.util.ArrayList;

public class Bus {
	protected String name;
	protected String aircondition;
	protected String wheels;
	protected String engine;
	protected ArrayList features = new ArrayList();

	public void prepare() {

		System.out.println("Buying susspension ...");
		System.out.println("Buying engine...");
		System.out.println("Buying features: ");
		
	}

	public void prepareProduction() {
		System.out.println("Preparing " + name);
	}

	public void assemble() {
		System.out.println("Assembling " + name);
	}

	public void paint() {
		System.out.println("Painting " + name);
	}

	public void test() {
		System.out.println("Testing " + name);
	}

	public String getName() {
		return name;

	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append(aircondition + "\n");
		display.append(wheels + "\n");
		display.append(engine + "\n");
		for (int i = 0; i < features.size(); i++) {
			display.append((String) features.get(i) + "\n");
		}
		return display.toString();
	}

}
