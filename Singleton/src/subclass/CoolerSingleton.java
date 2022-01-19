package subclass;

public class CoolerSingleton extends Singleton {
	// useful instance variables here
	protected static CoolerSingleton uniqueInstance;

	private CoolerSingleton() {
		super();
		System.out.println("CoolerSingleton()");
	}

	// useful methods here
	public static CoolerSingleton getInstance() {
		if (uniqueInstance == null) {
			System.out.println("getInstance(): First time getInstance was invoked in CoolerSingleton!");
			uniqueInstance = new CoolerSingleton();
		}
		return uniqueInstance;
	}
}