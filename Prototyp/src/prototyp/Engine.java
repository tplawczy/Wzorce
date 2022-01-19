package prototyp;

public class Engine implements Cloneable {
	private String typ;

	public Engine(final String typ) {
		this.typ = typ;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Engine{");
		sb.append("typ='").append(typ).append('\'');
		sb.append(", idObiektu=").append(System.identityHashCode(this));
		sb.append('}');
		return sb.toString();
	}
}
