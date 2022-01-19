package busaf;

import busaf.dealer.AfricaBusDealer;
import busaf.dealer.BusDealer;
import busaf.dealer.ScandinaviaBusDealer;
import busaf.bus.Bus;;

public class BusTestDrive {

	 
	public static void main(String[] args) {
		BusDealer africaDealer = new AfricaBusDealer();
		BusDealer scandinaviaDealer = new ScandinaviaBusDealer();
 
		Bus bus = africaDealer.orderBus("city");
		System.out.println("Egipt ordered a " + bus + "\n");
		bus = scandinaviaDealer.orderBus("city");
		System.out.println("Sweden ordered a " + bus + "\n");
		bus = africaDealer.orderBus("intercity");
		System.out.println("Egipt ordered a " + bus + "\n");
		bus = scandinaviaDealer.orderBus("intercity");
		System.out.println("Sweden ordered a " + bus + "\n");
		bus = africaDealer.orderBus("military");
		System.out.println("Egipt ordered a " + bus + "\n");
		bus = scandinaviaDealer.orderBus("military");
		System.out.println("Sweden ordered a " + bus + "\n");
		
		
		
	}
}
