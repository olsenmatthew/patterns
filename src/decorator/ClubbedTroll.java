package decorator;

public class ClubbedTroll implements Troll {
	private Troll troll;

	public ClubbedTroll(Troll troll) {
		this.troll = troll;
	}

	@Override
	public void attack() {
		troll.attack();
		System.out.println("The troll swings at the enemy with a club!");
	}

	@Override
	public int getAttackPower() {
		return troll.getAttackPower() + 10;
	}

	@Override
	public void fleeBattle() {
		troll.fleeBattle();
	}

}
