package busaf.equipmentfactory;

import busaf.equipment.accessory.*;
import busaf.equipment.armour.*;
import busaf.equipment.floor.*;
import busaf.equipment.trunk.*;
import busaf.equipment.traffic.*;
import busaf.equipment.engin.*;

public class ScandinavianBusEquipmentFactory implements BusEquipmentFactory {

	public Floor createFloor() {
		return new Low();
	}

	public Trunk createTrunk() {
		return new Luggage();
	}

	public Engin createEngin() {
		return new Hybrid();
	}

	public Traffic createTraffic() {
		return new RightHandTraffic();
	}

	public Armour createArmour() {
		return new Light();
	}
	public Accessory[] createAccessory() {

		Accessory accessory[] = { new EnhancedHeating(), new SeatBelts() };
		return accessory;
	}
}
