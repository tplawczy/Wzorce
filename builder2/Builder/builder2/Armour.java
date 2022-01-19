package builder2;

public class Armour {
	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Armour{" + " Type='" + type + '\'' + '}';
	}
}
