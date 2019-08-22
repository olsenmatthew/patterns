package builder;

/**
 * 
 * @author Matthew Olsen
 *
 *         The intention of the Builder pattern is to find a solution to the
 *         telescoping constructor anti-pattern. The telescoping constructor
 *         anti-pattern occurs when the increase of object constructor parameter
 *         combination leads to an exponential list of constructors. Instead of
 *         using numerous constructors, the builder pattern uses another object,
 *         a builder, that receives each initialization parameter step by step
 *         and then returns the resulting constructed object at once.
 * 
 *         The Builder pattern has another benefit. It can be used for objects
 *         that contain flat data (html, SQL, X.509 certificate etc...), that is
 *         to say, data that can't easily be edited. This type of data can't be
 *         edited step by step and must be edited at once. The best way to
 *         construct such an object is to use a builder class.
 * 
 *         We want to build {@link Hero} objects, but its construction is
 *         complex because of the many parameters needed. To aid the user we
 *         introduce {@link Builder} class. {@link Hero.Builder} takes the
 *         minimum parameters to build {@link Builder} class.
 *         {@link Hero.Builder} takes the minimum parameters to build
 *         {@link Hero} object in its constructor. After that additional
 *         configuration for the {@link Hero} object can be done using the
 *         fluent {@link Builder} interface. When configuration is ready the
 *         build method is called to receive the final {@link Hero} object.
 *
 */
public class App {

	public static void main(String... args) {
		Hero mage = new Hero.Builder(Profession.MAGE, "Malcolm").withHairColor(HairColor.BLACK).withWeapon(Weapon.STAFF)
				.build();
		System.out.println(mage.toString());

		Hero warrior = new Hero.Builder(Profession.WARRIOR, "Matthew").withHairColor(HairColor.BLACK)
				.withHairType(HairType.PERFECT).withArmor(Armor.KEVLAR).withWeapon(Weapon.KEYBOARD).build();
		System.out.println(warrior.toString());

		Hero thief = new Hero.Builder(Profession.THIEF, "Bernanke").withHairColor(HairColor.BLONDE)
				.withWeapon(Weapon.BOW).build();
		System.out.println(thief);

	}

}
