package prototype;

public class Engine implements Cloneable {

	private String fueltype;
	private Transmission transmission;

	public String getFueltype() {
		return fueltype;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public Object clone() throws CloneNotSupportedException {
		Engine engineClone = (Engine) super.clone();
		return engineClone;
	}

	public Object deepclone() throws CloneNotSupportedException {
		Engine engineClone = (Engine) super.clone();
		engineClone.setTransmission((Transmission) getTransmission().clone());
		return engineClone;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Engine{");
		sb.append("typ='").append(fueltype).append('\'');
		sb.append("transmission='").append(transmission).append('\'');
		sb.append(", idObiektuEngine=").append(System.identityHashCode(this));
		sb.append('}');
		return sb.toString();
	}

}
