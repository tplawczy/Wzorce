package busaf.equipmentfactory;

import busaf.equipment.floor.Floor;
import busaf.equipment.trunk.Trunk;
import busaf.equipment.traffic.Traffic;
import busaf.equipment.engin.Engin;
import busaf.equipment.accessory.Accessory;
import busaf.equipment.armour.Armour;

public interface BusEquipmentFactory {

	public Floor createFloor();

	public Trunk createTrunk();

	public Engin createEngin();

	public Traffic createTraffic();

	public Armour createArmour();

	public Accessory[] createAccessory();

}
