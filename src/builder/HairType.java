package builder;

public enum HairType {
	BALD("bald"), SHORT("short"), PERFECT("perfect"), LONG_STRAIGHT("long straight");

	private String title;

	HairType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
