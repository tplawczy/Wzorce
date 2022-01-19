package builder2;

public class Client {

	public static void main(String[] args) {

		Builder cityBusBuilder = new Citybus();
		Director busDirector = new Director(cityBusBuilder);
		busDirector.buildBus();
		Bus citybus = busDirector.getBus();
		
		
		 	Builder intercityBusBuilder = new InterCitybus();
		Director busDirector1 = new Director(intercityBusBuilder);
		busDirector1.buildBus();
		Bus intercitybus = busDirector1.getBus();
		 

		System.out.println(citybus);
		System.out.println(intercitybus);
	}
}
