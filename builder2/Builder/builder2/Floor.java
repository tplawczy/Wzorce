package builder2;

public class Floor {
	private String type;
	private int groundDistance;

	public int getGroundDistance() {
		return groundDistance;
	}

	public void setGroundDistance(int groundDistance) {
		this.groundDistance = groundDistance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Floor{" + "type='" + type + '\'' + "Distance from ground='" + groundDistance + '\'' + '}';
	}

}
