package factory.weapons;

public class OrcWeapon implements Weapon {
	private WeaponType weaponType;

	public OrcWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Orcish " + getWeaponType();
	}

	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}

}
