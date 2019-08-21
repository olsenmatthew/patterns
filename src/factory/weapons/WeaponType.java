package factory.weapons;

public enum WeaponType {
	SHORT_SWORD("short sword"), SPEAR("spear"), AXE("axe"), HAMMER("hammer"), UNDEFINED("");

	private String title;

	WeaponType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
