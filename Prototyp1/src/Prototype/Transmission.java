package prototype;

public class Transmission implements Cloneable{
	private int gear;
	public String type = "Manual";

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public Transmission(int gear, String type) {

		this.gear = gear;
		this.type = type;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Transmission{");
		sb.append("gear='").append(gear).append('\'');
		sb.append("type='").append(type).append('\'');
		sb.append(", idObiektuTransmission=").append(System.identityHashCode(this));
		sb.append('}');
		return sb.toString();
	}
}