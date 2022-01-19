package builder2;

import busaf.dealer.*;
import busaf.dealer.AfricaBusDealer;
import busaf.dealer.BusDealer;



public class BuilderVSFactory {

	public static void main(String[] args) {
		long start;
		long end;
		int n = 10;

		BusDealer africaDealer = new AfricaBusDealer();
		Builder busBuilder = new Citybus();
		Director busDirector = new Director(busBuilder);
//--------------------------Time Abstract Factory -------------------------------------
		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			africaDealer.orderBus("city");
		}
		end = System.nanoTime();

		long af = end - start;
		System.out.print("Czas generowania 10 obiektów przez AbstractFactory:" + af + "\n");
//--------------------------Test Builder-----------------------------------------------
		start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			busDirector.buildBus();
			busDirector.getBus();
		}
		end = System.nanoTime();

		long br = end - start;
		System.out.print("Czas generowania 10 obiektów przez Builder:" + br + "\n");

	}
}
