package builder;

public enum Weapon {
	KEYBOARD, SWORD, AXE, WARHAMMER, BOW, STAFF;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
