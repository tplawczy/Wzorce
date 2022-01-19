package busaf.bus;

import busaf.equipmentfactory.BusEquipmentFactory;

public class IntercityBus extends Bus {
		BusEquipmentFactory equipmentFactory;

		public IntercityBus(BusEquipmentFactory equipmentFactory) {
			this.equipmentFactory = equipmentFactory;
		}

		public void produce() {
			trunk = equipmentFactory.createTrunk();
			engin= equipmentFactory.createEngin();
			accessory = equipmentFactory.createAccessory();
			traffic = equipmentFactory.createTraffic();
		}
}
