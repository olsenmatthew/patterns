package builder;

public class Hero {

	private final Profession profession;
	private final String name;
	private final HairType hairType;
	private final HairColor hairColor;
	private final Armor armor;
	private final Weapon weapon;

	private Hero(Builder builder) {
		this.profession = builder.profession;
		this.armor = builder.armor;
		this.name = builder.name;
		this.hairType = builder.hairType;
		this.hairColor = builder.hairColor;
		this.weapon = builder.weapon;
	}

	public Profession getProfession() {
		return profession;
	}

	public String getName() {
		return name;
	}

	public HairType getHairType() {
		return hairType;
	}

	public HairColor getHairColor() {
		return hairColor;
	}

	public Armor getArmor() {
		return armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("This is a ").append(profession).append(" named ").append(name);
		if (hairColor != null || hairType != null) {
			sb.append(" with ");
			if (hairColor != null) {
				sb.append(hairColor).append(" ");
			}
			if (hairType != null) {
				sb.append(hairType).append(" ");
			}
			sb.append(hairType != HairType.BALD ? "hair" : "head");
		}
		if (armor != null) {
			sb.append(" wearing ").append(armor);
		}
		if (weapon != null) {
			sb.append(" and wielding ").append(weapon);
		}
		sb.append(".");
		return sb.toString();
	}

	public static class Builder {
		private final Profession profession;
		private final String name;
		private HairType hairType;
		private HairColor hairColor;
		private Armor armor;
		private Weapon weapon;

		public Builder(Profession profession, String name) {
			if (profession == null || name == null) {
				System.err.println("profession and name must be non-null");
			}
			this.profession = profession;
			this.name = name;
		}

		public Builder withHairType(HairType hairType) {
			this.hairType = hairType;
			return this;
		}

		public Builder withHairColor(HairColor hairColor) {
			this.hairColor = hairColor;
			return this;
		}

		public Builder withArmor(Armor armor) {
			this.armor = armor;
			return this;
		}

		public Builder withWeapon(Weapon weapon) {
			this.weapon = weapon;
			return this;
		}

		public Hero build() {
			return new Hero(this);
		}
	}
}
