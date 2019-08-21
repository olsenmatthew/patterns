package singleton;

public class App {

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		System.out.println(x);
		Singleton i = Singleton.getInstance();
		System.out.println(i);
		System.out.println(i == x && x == Singleton.getInstance());
	}

}
