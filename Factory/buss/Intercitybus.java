package buss;

public class Intercitybus extends Bus {
	public Intercitybus() {
		name = "Intercitybus";
		floor = "Normal";
		length = "Midi";
		engine = "Diesel";

		features.add("Tinted Windows");
		features.add("Toilet");
		features.add("Navigation");
		features.add("Cofee Express");
	}
}