package factory;

import factory.blacksmith.AsgardianBlacksmith;
import factory.blacksmith.Blacksmith;
import factory.blacksmith.ElfBlacksmith;
import factory.blacksmith.OrcBlacksmith;
import factory.weapons.Weapon;
import factory.weapons.WeaponType;

/*
 * The Factory Method is a creational design pattern which uses factory methods to deal with
 * the problem of creating objects without specifying the exact class of object that will
 * be created. This is done by creating objects via calling a factory method in a either
 * specified in an interface and implemented by child classes or implemented in a base class
 * and optionally overridden by derived classes-rather than by calling a constructor.
 * 
 * In this Factory Method example we have an interface {@link Blacksmith} with a method for
 * creating objects {@link Blacksmith#manufactureWeapon}). The concrete subclasses (
 * {@link OrcBlacksmith}, {@link ElfBlacksmith}) then override the method to produce
 * objects of their liking.
 * 
 */
public class App {

	private final Blacksmith blacksmith;

	/*
	 * Creates and instance of App which will use blacksmith to manufacture the
	 * weapons for war. App is unaware which concrete implmentation to use may
	 * depend on configuration or the type of rival in war.
	 * 
	 * @param blacksmith a non-null implmentation of blacksmith
	 */
	public App(Blacksmith blacksmith) {
		this.blacksmith = blacksmith;
	}

	public static void main(String... args) {
		// lets go to war with Orc weapons
		App app = new App(new OrcBlacksmith());
		app.manufactureWeapons();

		app = new App(new ElfBlacksmith());
		app.manufactureWeapons();

		app = new App(new AsgardianBlacksmith());
		app.manufactureWeapons();

	}

	private void manufactureWeapons() {
		Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
		System.out.println(weapon.toString());
		weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
		System.out.println(weapon.toString());
		weapon = blacksmith.manufactureWeapon(WeaponType.HAMMER);
		System.out.println(weapon);
	}

}
