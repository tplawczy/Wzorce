package prototyp;

public class Vehicle implements Cloneable {
	private int pojemnosc;
	private int ileDrzwi;
	private Engine engine;

	public Vehicle(final int pojemnosc, final int ileDrzwi, final Engine engine) {
		this.pojemnosc = pojemnosc;
		this.ileDrzwi = ileDrzwi;
		this.engine = engine;
	}

	public int getPojemnosc() {
		return pojemnosc;
	}

	public void setPojemnosc(final int pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public int getIleDrzwi() {
		return ileDrzwi;
	}

	public void setIleDrzwi(final int ileDrzwi) {
		this.ileDrzwi = ileDrzwi;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(final Engine engine) {
		this.engine = engine;
	}

	public Object clone() throws CloneNotSupportedException {
		Vehicle myClone = (Vehicle) super.clone();
	        //myClone.setEngine((Engine) getEngine().clone());
		return myClone;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Vehicle{");
		sb.append("pojemnosc=").append(pojemnosc);
		sb.append(", ileDrzwi=").append(ileDrzwi);
		sb.append(", engine=").append(engine);
		sb.append(", idObiektu=").append(System.identityHashCode(this));
		sb.append('}');
		return sb.toString();
	}
}
