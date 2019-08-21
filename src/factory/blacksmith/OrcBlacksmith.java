package factory.blacksmith;

import factory.weapons.OrcWeapon;
import factory.weapons.Weapon;
import factory.weapons.WeaponType;

public class OrcBlacksmith implements Blacksmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new OrcWeapon(weaponType);
	}

}
