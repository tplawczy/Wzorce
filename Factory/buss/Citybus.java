package buss;

public class Citybus extends Bus {
	public Citybus() {
		name = "Citybus";
		floor = "Low";
		length = "Mega";
		engine = "Electrical";

		features.add("Non-tinted Windows");
		features.add("Three doors");
		features.add("Monitoring");
		features.add("Seatbelts");
	}
}
