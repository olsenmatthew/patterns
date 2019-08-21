package singleton;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		if (instance == null) {
			instance = this;
		} else {
			System.out.println("Already Initialized" + this.toString());
		}
	}

	/*
	 * Synchronized for thread safety
	 */
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
