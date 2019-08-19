package template;

/*
 * concrete class
 */
public class TeaBrewer extends Brewer {

	@Override
	public void getIngredients() {
		// TODO Auto-generated method stub
		System.out.println("getIngredients: Gather milk tea + ice + sugar");
	}

	@Override
	public void addIngredients() {
		// TODO Auto-generated method stub
		System.out.println("addIngredients: Adding ingredients");
	}

	@Override
	public void addToppings() {
		// TODO Auto-generated method stub
		System.out.println("addToppings: Add Boba");
	}

}
