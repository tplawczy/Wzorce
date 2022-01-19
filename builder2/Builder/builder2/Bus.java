package builder2;

public class Bus {

	private Floor floor;
	private Engine engine;
	private Armour armour;
	private Body body;
	private Accessorries accessorries;

	public Floor getFlor() {
		return floor;
	}

	public void setFlor(Floor floor) {
		this.floor = floor;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Armour getArmour() {
		return armour;
	}

	public void setArmour(Armour armour) {
		this.armour = armour;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Accessorries getAccessorries() {
		return accessorries;
	}

	public void setAccessorries(Accessorries accessorries) {
		this.accessorries = accessorries;
	}


    @Override
    public String toString() {
        return "Bus{" +
                "Floor=" + floor +
                " Engine=" + engine +
                " Armour=" + armour +
                " Body="+ body +
                
               " Accessories="+ accessorries+"}";
    }
}
