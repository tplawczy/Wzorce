package prototyp;

public class VehicleBuilder {
	
	    private int pojemnosc = 50;
	    private int ileDrzwi = 4;
	    private Engine engine;

	    public VehicleBuilder setPojemnosc(final int pojemnosc) {
	        this.pojemnosc = pojemnosc;
	        return this;
	    }

	    public VehicleBuilder setIleDrzwi(final int ileDrzwi) {
	        this.ileDrzwi = ileDrzwi;
	        return this;
	    }

	    public VehicleBuilder setEngine(final Engine engine) {
	        this.engine = engine;
	        return this;
	    }

	    public Vehicle createVehicle() {
	        return new Vehicle(pojemnosc, ileDrzwi, engine);
	    }
	}

