package builder2;

public class Director {

	private Builder builder;

	Director(Builder builder) {
		this.builder = builder;
	}

	public void buildBus() {
		builder.buildFloor();
		builder.buildEngine();
		builder.buildBody();
		builder.buildArmour();
		builder.buildAccessorries();

	}

	public Bus getBus() {
		return this.builder.getBus();
	}
}
