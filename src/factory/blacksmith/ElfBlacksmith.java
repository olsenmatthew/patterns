package factory.blacksmith;

import factory.weapons.ElfWeapon;
import factory.weapons.Weapon;
import factory.weapons.WeaponType;

public class ElfBlacksmith implements Blacksmith {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new ElfWeapon(weaponType);
	}

}
