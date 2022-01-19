package prototype;

public class Car implements Cloneable {

	private Engine engine;
	private int doors;
	private int power;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public int getPower() {
		return power;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Object clone() throws CloneNotSupportedException {
		Car carClone = (Car) super.clone();	
		return carClone;
	}
	public Object deepclone() throws CloneNotSupportedException {
		Car carClone = (Car) super.clone();
	carClone.setEngine((Engine) getEngine().deepclone());	
		return carClone;
	}

	public String toString() {

		final StringBuilder sb = new StringBuilder("Car{");
		sb.append("doors=").append(doors);
		sb.append(",Power=").append(power);
		sb.append(", engine=").append(engine);
		sb.append(", idObiektuCar=").append(System.identityHashCode(this));
		sb.append('}');
		return sb.toString();

	}
}
