package factory.weapons;

public class AsgardianWeapon implements Weapon {

	private WeaponType weaponType;

	public AsgardianWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Asgardian " + weaponType;
	}

	@Override
	public WeaponType getWeaponType() {
		// TODO Auto-generated method stub
		return null;
	}

}
