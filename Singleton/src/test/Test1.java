package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		List<SingletonThread> watki = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			SingletonThread watek = new SingletonThread();
			watki.add(watek);
		}
		
		long start = System.nanoTime();
		for (Thread watek : watki) {
			watek.start();
		}
		for (Thread watek : watki) {
			watek.join();
		}
		long koniec =  System.nanoTime();
		SingletonThread wzorcowy = watki.get(0);
		boolean bylBlad = false;
		for (SingletonThread watek : watki) {
			if (watek.getSingleton() != wzorcowy.getSingleton()) {
				bylBlad = true;
			}
		}

		if (bylBlad) {
			System.out.println("blad - zduplikowany singleton");
		} else {
			System.out.println("ok - tylko jeden singleton");
		}
		System.out.println("Czas wykonania " + (koniec - start) + "ns.");

//		for(int i=0; i<watki.size(); i++) {
//			Thread watek = watki.get(i);
//			
//			System.out.println(watek);
//		}

	}

	static class SingletonThread extends Thread {
		private volatile Object singleton;

		public Object getSingleton() {
			return singleton;

		}

		@Override
		public void run() {
			//singleton = classic.Singleton.getInstance();
			//singleton= dcl.Singleton.getInstance();
			singleton = threadsafe.Singleton.getInstance();
			// TODO Auto-generated method stub

		}

	}
}
