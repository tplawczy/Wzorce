package busaf.equipmentfactory;

import busaf.equipment.accessory.*;
import busaf.equipment.armour.*;
import busaf.equipment.floor.*;
import busaf.equipment.traffic.*;
import busaf.equipment.trunk.*;
import busaf.equipment.engin.*;

public class AfricaBusEquipmentFactory implements BusEquipmentFactory {

	public Floor createFloor() {
		return new Low();
	}

	public Trunk createTrunk() {
		return new RoofTrunk();
	}

	public Engin createEngin() {
		return new Diesel();
	}

	public Traffic createTraffic() {
		return new LeftHandTraffic();
	}

	public Armour createArmour() {
		return new Heavy();
	}
	public Accessory[] createAccessory() {

		Accessory accessory[] = { new EnhancedCooling(), new TintedWindows() };
		return accessory;
	}
}