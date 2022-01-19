package builder2;

public class Body {

	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Body{" + "Body='" + type + '\'' + '}';
	}

}
