package busaf.bus;

import busaf.equipment.accessory.Accessory;
import busaf.equipment.armour.Armour;
import busaf.equipment.engin.Engin;
import busaf.equipment.floor.Floor;
import busaf.equipment.trunk.Trunk;
import busaf.equipment.traffic.Traffic;

abstract public class Bus {
	String name;
	Floor floor;
	Trunk trunk;
	Engin engin;
	Traffic traffic;
	Armour armour;
	Accessory accessory[];

	public abstract void produce();

	public void prepareProduction() {
		System.out.println("Preparing " + name);
	}

	public void assemble() {
		System.out.println("Assembling " + name);
	}

	public void test() {
		System.out.println("Testing " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");
		if (floor != null) {
			result.append(floor);
			result.append("\n");
		}
		if (trunk != null) {
			result.append(trunk);
			result.append("\n");
		}
		if (engin != null) {
			result.append(engin);
			result.append("\n");
		}
		if (traffic != null) {
			result.append(traffic);
			result.append("\n");
		}
		if (armour != null) {
			result.append(armour);
			result.append("\n");
		}
		if (accessory != null) {
			for (int i = 0; i < accessory.length; i++) {
				result.append(accessory[i]);
				if (i < accessory.length - 1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		return result.toString();
	}

}
