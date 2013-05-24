public class Milk extends Ingredient
{
	public Milk(Beverage b)
	{
		this.b = b;
		if(b.getRecipe().getType().equals("Coffee"))
			this.recipe = new CoffeeDrink();
		else
			this.recipe = new TeaDrink();
	}
	
	public double getCost()
	{
		return this.b.getCost() + .3;
	}
	
	public String getDescription() {
		return "milk";
	}
}