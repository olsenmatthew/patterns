package factory.blacksmith;

import factory.weapons.AsgardianWeapon;
import factory.weapons.Weapon;
import factory.weapons.WeaponType;

public class AsgardianBlacksmith implements Blacksmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new AsgardianWeapon(weaponType);
	}

}
