package busfm.bus;

import busfm.dealer.AfricaBusDealer;
import busfm.dealer.BusDealer;
import busfm.dealer.ScandinaviaBusDealer;

public class BusTestDrive {

	public static void main(String[] args) {
		BusDealer  africadealer= new AfricaBusDealer();
		BusDealer scandinaviadealer = new ScandinaviaBusDealer();
 
		Bus bus = africadealer.orderBus("city");
		System.out.println("Egipt ordered a " + bus.getName() + "\n");
	
     
		bus = africadealer.orderBus("military");
		System.out.println("Kenia ordered a " + bus.getName() + "\n");
		
		bus = scandinaviadealer.orderBus("city");
		System.out.println("Sweden ordered a " + bus.getName() + "\n");
		
		bus = scandinaviadealer.orderBus("military");
		System.out.println("Norway ordered a " + bus.getName() + "\n");

		
		
		
		
		
		
	}
	
	
}
 