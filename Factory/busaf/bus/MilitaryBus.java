package busaf.bus;

import busaf.equipmentfactory.BusEquipmentFactory;

public class MilitaryBus extends Bus {
	BusEquipmentFactory equipmentFactory;

	public MilitaryBus(BusEquipmentFactory equipmentFactory) {
		this.equipmentFactory = equipmentFactory;
	}

	public void produce() {
		armour = equipmentFactory.createArmour();
		engin = equipmentFactory.createEngin();
		accessory = equipmentFactory.createAccessory();
		traffic = equipmentFactory.createTraffic();
	}
}
