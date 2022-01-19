package busaf.bus;

import busaf.equipmentfactory.BusEquipmentFactory;

public class Citybus extends Bus {
	BusEquipmentFactory equipmentFactory;

	public Citybus(BusEquipmentFactory equipmentFactory) {
		this.equipmentFactory = equipmentFactory;
	}

	public void produce() {
		floor = equipmentFactory.createFloor();
		engin= equipmentFactory.createEngin();
		accessory = equipmentFactory.createAccessory();
		traffic = equipmentFactory.createTraffic();
	}
}