public class Jasmine extends Ingredient
{
	public Jasmine(Beverage b)
	{
		this.b = b;
		this.recipe = b.recipe;
	}
	
	public double getCost()
	{
		return this.b.getCost() + .5;
	}

	public String getDescription()
	{
		return "jasmine";
	}
	
}