package builder2;

import java.util.ArrayList;
import java.util.List;

public class Citybus implements Builder {

	private Bus citybus;

	Citybus() {
		this.citybus = new Bus();
	}

	@Override
	public void buildFloor() {
		Floor floor = new Floor();
		floor.setType("Low");
		floor.setGroundDistance(5);
		citybus.setFlor(floor);
	}

	@Override
	public void buildEngine() {
		Engine engine = new Engine();
		engine.setType("Hybrid");
		engine.setCapacity(0);
		citybus.setEngine(engine);
	}

	@Override
	 public void buildBody() {
		  Body body = new Body();
		  body.type=("Long body");
		  citybus.setBody(body);
	}
	@Override
		public void buildArmour() {
		  Armour armour= new Armour();
		  armour.type=("No Armour");
		  citybus.setArmour(armour);
	}
	@Override
		public void buildAccessorries() {
		  Accessorries accessories= new Accessorries();	
		  accessories.name=new ArrayList<String>();
		  accessories.name.add ("Monitoring");
		 accessories.name.add("SeatBelts");
		  citybus.setAccessorries(accessories);
	}

	@Override
	public Bus getBus() {
		return this.citybus;
	}
}
