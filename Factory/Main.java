import busfm.dealer.ScandinaviaBusDealer;
import buss.Bus;
import buss.BusDealer;
import buss.Intercitybus;
import buss.SimpleBusFactory;
import factorynoreflection.BusFactoryNoReflection;
import factorynoreflection.CitybusSupplier;
import factoryreflection.BusFactoryWithReflection;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		long start;
		long end;
		int n = 100000000;

		// Simple factory:
		SimpleBusFactory factory = new SimpleBusFactory();
		buss.BusDealer store = new BusDealer(factory);
		start = System.nanoTime();

		for (int i = 0; i < n; i++) {
			Bus bus = store.orderBus("Citybus");
		}
		end = System.nanoTime();

		long sf = end - start;
		System.out.print("Czas generowania 100000000 obiektów przez Simple Factory:" + sf + "\n");
		// Factory Method:
		busfm.dealer.BusDealer scandinaviadealer = new ScandinaviaBusDealer();
		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			busfm.bus.Bus bus = scandinaviadealer.orderBus("city");
		}
		end = System.nanoTime();
		long fm = end - start;
		System.out.print("Czas generowania 100000000 obiektów przez Factory Method:" + fm + "\n");
		
		
		// Factory with reflection:
		BusFactoryWithReflection.instance().registerBus("Intercitybus", Intercitybus.class);
		start = System.nanoTime(); 
		for(int i = 0; i < n; i++){
			Bus bus = BusFactoryWithReflection.instance().createBus("Intercitybus");       
	        }
		end = System.nanoTime();
		long fwithref = end - start;
		System.out.print("Czas generowania 100000000 obiektów przez Factory class registration with reflection:" + fwithref + "\n");
	
		// Factory without Reflection:
		BusFactoryNoReflection.instance().registerBus("Citybus",new CitybusSupplier());
		start = System.nanoTime(); 
		for(int i = 0; i < n; i++){
			Bus bus = BusFactoryNoReflection.instance().createBus("Citybus");       
	        }
		end = System.nanoTime();
		long fnoref = end - start;
		System.out.print("Czas generowania 100000000 obiektów przez Factory class registration without reflection:" + fnoref + "\n");
	}


}
