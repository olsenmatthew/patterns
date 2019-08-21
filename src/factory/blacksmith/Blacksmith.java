package factory.blacksmith;

import factory.weapons.Weapon;
import factory.weapons.WeaponType;

public interface Blacksmith {
	Weapon manufactureWeapon(WeaponType weaponType);
}
