package serialization;

import java.io.Serializable;

public class Car implements Serializable {
	Engine engine;
	Tyre[] tyre  ;
	public Engine getEngine() {
		return engine;
	}
	public Tyre[] getTyre() {
		return tyre;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setTyre(Tyre[] tyre) {
		this.tyre = tyre;
	}
	
	public Car(Engine engine,Tyre[] tyre) {
		this.engine=engine;
		this.tyre = tyre;
	}
	
}
