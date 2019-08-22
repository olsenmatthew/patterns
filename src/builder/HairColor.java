package builder;

public enum HairColor {
	WHITE, BLONDE, RED, BROWN, BLACK;

	@Override
	public String toString() {
		return name().toLowerCase();
	}
}
