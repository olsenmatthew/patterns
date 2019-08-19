package template;

/*
 * template for concrete classes
 */
public abstract class Brewer {
	public final void brew() {
		this.getIngredients();
		this.boilWater();
		this.addIngredients();
		this.mixIngredients();
		this.addToppings();
		this.pourBrew();
	}

	public abstract void getIngredients();

	public void boilWater() {
		System.out.println("boilWater: heat to 212 Fahrenheit ;)");
	}

	public abstract void addIngredients();

	public final void mixIngredients() {
		System.out.println("mixIngredients: mixing ingredients");
	}

	public abstract void addToppings();

	public final void pourBrew() {
		System.out.println("pourBrew: brewing ingredients");
	}

}
