package subclass;

public class HotterSingleton extends Singleton {
	// useful instance variables here
	protected static HotterSingleton uniqueInstance;

	private HotterSingleton() {
		super();
		System.out.println("HotterSingleton()");
	}

	// useful methods here
	public static HotterSingleton getInstance() {
		if (uniqueInstance == null) {
			System.out.println("getInstance(): First time getInstance was invoked in HotterSingleton!");
			uniqueInstance = new HotterSingleton();
		}
		return uniqueInstance;
	}
}
