package decorator;

public class App {
	public static void main(String... args) {
		System.out.println("A simple troll approaches.");
		Troll troll = new SimpleTroll();
		troll.attack();
		troll.fleeBattle();
		System.out.println("Simple troll power " + troll.getAttackPower());

		System.out.println("-----------------------------------------------");

		System.out.println("A troll with a huge club suprises you.");
		Troll clubbedTroll = new ClubbedTroll(troll);
		clubbedTroll.attack();
		clubbedTroll.fleeBattle();
		System.out.println("Clubbed troll power " + clubbedTroll.getAttackPower());

	}
}
