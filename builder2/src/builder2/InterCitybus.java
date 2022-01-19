package builder2;

import java.util.ArrayList;
import java.util.List;

public class InterCitybus implements Builder {

	private Bus intercitybus;

	InterCitybus() {
		this.intercitybus = new Bus();
	}

	@Override
	public void buildFloor() {
		Floor floor = new Floor();
		floor.setType("Normal");
		floor.setGroundDistance(15);
		intercitybus.setFlor(floor);
	}

	@Override
	public void buildEngine() {
		Engine engine = new Engine();
		engine.setType("Diesel");
		engine.setCapacity(2000);
		intercitybus.setEngine(engine);
	}

	@Override
	 public void buildBody() {
		  Body body = new Body();
		  body.type=("Middle body");
		  intercitybus.setBody(body);
	}
	@Override
		public void buildArmour() {
		  Armour armour= new Armour();
		  armour.type=("No Armour");
		  intercitybus.setArmour(armour);
	}
	@Override
		public void buildAccessorries() {
		  Accessorries accessories= new Accessorries();	
		  accessories.name=new ArrayList<String>();
		  accessories.name.add ("Navigation");
		 accessories.name.add("Cofee Express");
		  intercitybus.setAccessorries(accessories);
	}

	@Override
	public Bus getBus() {
		return this.intercitybus;
	}
}
