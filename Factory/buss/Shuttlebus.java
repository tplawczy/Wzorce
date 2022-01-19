package buss;

public class Shuttlebus extends Bus {
	public Shuttlebus() {
		name = "Shuttlebus";
		floor = "Normal";
		length = "Mini";
		engine = "Hybrid";

		features.add("QR code scanner");
		features.add("Monitoring");
		features.add("For Disabled people");
	}
}
